package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivisionpopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.shopclues.com/");
		driver.findElement(By.xpath("//button[text()='Allow']")).click();
		
		

}
}