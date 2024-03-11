package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleElements {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		driver.manage().window().maximize();
		WebElement searchbox =driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("sunglasses");
		searchbox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//img[@class='_2r_T1I'][1]")).click();
		Thread.sleep(3000);
		Set<String> win =driver.getWindowHandles();
		Iterator<String> it=win.iterator();		
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
	
		}
}