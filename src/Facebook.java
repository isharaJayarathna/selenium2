//Ishara Jayarathna
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook{

	public static void main(String[] args) throws InterruptedException {
		
		 //@Test
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Downloads\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		 
		//open google website
		 WebDriver driver =new FirefoxDriver();
		 driver.get("http://www.google.com");
		 Thread.sleep(2000);
		 
		 
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	
		 
		//search for Facebook
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Facebook");
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.name("btnK")).submit();
		 Thread.sleep(2000);
		 
		//click the Facebook login page
		 driver.get("https://www.facebook.com/login/web");
		 Thread.sleep(2000);
		 
		 
		 //Enter username
		 driver.findElement(By.id("email")).sendKeys("Ishara");
		 Thread.sleep(2000);
		
		//Enter password
		 driver.findElement(By.id("pass")).sendKeys("ishara**");
		 Thread.sleep(2000);
		 
		//click on login in button
		 driver.findElement(By.id("loginbutton")).click();
		 Thread.sleep(1000);
		 
		 //close the page
		 driver.close();
		
		 
		
	}

}
