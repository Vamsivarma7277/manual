package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverelements {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("123456");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		driver.switchTo().activeElement();
		driver.quit();
		//driver.close();
		}
}