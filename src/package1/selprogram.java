package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selprogram {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.findElement(By.cssSelector("input[aria-label='Email address or phone number']")).sendKeys("12345");
		
//		driver.findElement(By.cssSelector("input[aria-label^='Email']")).sendKeys("12345");
//		driver.findElement(By.cssSelector("input[aria-label$='number']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[aria-label*='addr']")).sendKeys("12345");
		
}
}