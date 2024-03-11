package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestions {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");	
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("shoes");
		Thread.sleep(3000);
		 List<WebElement> auto = driver.findElements(By.xpath("//ul[@class='rilrtl-list'][3]/li"));
		 System.out.println(auto.size());
		 for (WebElement options: auto)
		 {
			 System.out.println(options.getText());
		 }
		 int s = auto.size();
		 auto.get(3).click();
	}
}
