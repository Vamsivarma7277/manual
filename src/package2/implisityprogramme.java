package package2;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implisityprogramme {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//button[text()='Change Text to Selenium Webdriver']")).click();
		driver.findElement(By.xpath("//button[text()='Display button after 10 seconds']")).click();
		driver.findElement(By.xpath("//button[text()='Enable button after 10 seconds']")).click();
		driver.findElement(By.xpath("//button[text()='Check Checkbox after 10 seconds']")).click();
}
}
