package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlescrollbarlocation {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=13862153769600039722&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9147478&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
driver.manage().window().maximize();
		Object Friuts = driver.findElement(By.xpath("//span[text()='Fruits']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		
	
		driver.findElement(By.xpath("//span[text()='Fruits']")).click();
WebElement search = driver.findElement(By.xpath("//span[text()='Fresh Tender Coconut Water, 1 Piece']"));
Thread.sleep(3000);
Point loc = search.getLocation();
int X=loc.getX();
int y=loc.getY();

 
 js.executeScript("+X+","+Y+");
}
}