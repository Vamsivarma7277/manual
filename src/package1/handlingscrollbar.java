package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;


public class handlingscrollbar {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://tinyurl.com/2z2rkvd3");	
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-600)");
}
}