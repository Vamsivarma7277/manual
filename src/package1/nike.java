package package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class nike {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.nike.com/in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//a[text()='Nike Metcon 9 By You'][1]"));
		Thread.sleep(2000);
		Point loc = search.getLocation();
	    int x = loc.getX();
	    int y = loc.getY();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("scrollBy("+x+", "+y+")");
	   
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest= new File("./screenshot./adc.png");
		
		FileUtils.copyFile(src,dest);
		driver.close();
		
}
}
