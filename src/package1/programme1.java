package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class programme1 {
	
	 
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args)
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");	
			driver.manage().window().maximize();
			
			//driver.findElement(By.linkText("हिन्दी")).click();
			//driver.findElement(By.linkText("Gmail")).click();
			
			//driver.findElement(By.partialLinkText("Sig")).click();
	}

}