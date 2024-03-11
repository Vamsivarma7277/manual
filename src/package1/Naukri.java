package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@Title='MNC']")).click();
		Thread.sleep(3000);
		Set<String> win =driver.getWindowHandles();
		Iterator<String> it=win.iterator();		
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
		
		
}
}