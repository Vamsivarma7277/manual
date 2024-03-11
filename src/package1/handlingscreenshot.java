package package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingscreenshot {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args, double x) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
	File dest =new File("./screenshot/abc.png");
	FileUtils.copyFile(src, dest);
	}
}