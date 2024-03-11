package package1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sampletest {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.findElement(By.id("fname")).sendKeys("Testing");
		driver.findElement(By.id("male")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int count = checkbox.size();
	for(int z=0;z<count;z++) {
	checkbox.get(z);
	}
	for(WebElement we : checkbox) {
		we.click();
	}
	js.executeScript("window.scrollBy(0,300)");
	WebElement dropdown = driver.findElement(By.id("testingDropdown"));
	Select s = new Select(dropdown);
	s.selectByVisibleText("Manual Testing");
	js.executeScript("window.scrollBy(0,300)");
	Thread.sleep(2000);
	
	WebElement elementtobedropped = driver.findElement(By.id("myImage"));
	WebElement elementtobedragged = driver.findElement(By.id("targetDiv"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(elementtobedropped, elementtobedragged).perform();
	
}
}