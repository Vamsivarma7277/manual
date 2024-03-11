package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class programme3 {
		
			
			 
			static
			{
				System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			}
			public static void main(String[] args)
			{
				FirefoxDriver driver = new FirefoxDriver();
				driver.get("https://www.facebook.com/");
               driver.findElement(By.tagName("textarea")).click();  
               driver.findElement(By.id("email")).sendKeys("12345");
                
				driver.findElement(By.id("pass")).sendKeys("abc@123");
                
                
			}
		}

