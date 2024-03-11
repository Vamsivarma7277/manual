package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		driver.manage().window().maximize();
		
		 WebElement Home = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		 Actions act =new Actions(driver);
		 act.moveToElement(Home).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']")).click();
		 driver.close();
		
}
}