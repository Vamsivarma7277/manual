package package1;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handelingdropdownapp3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.calculator.net/date-calculator.html");
			driver.manage().window().maximize();
			
			WebElement today_Month_ID = driver.findElement(By.id("today_Month_ID"));
			selectOptionFromDropdown(today_Month_ID, "May");
			
			
			WebElement today_Day_ID = driver.findElement(By.id("today_Day_ID"));
			selectOptionFromDropdown(today_Day_ID, "10");
			
			
			WebElement ageat_Month_ID = driver.findElement(By.id("ageat_Month_ID"));
			selectOptionFromDropdown(ageat_Month_ID, "Aug");
			
			
			WebElement ageat_Day_ID = driver.findElement(By.id("ageat_Day_ID"));
			selectOptionFromDropdown(ageat_Day_ID, "25");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[@class='cbmark']")).click();
			driver.findElement(By.xpath("//input[@value='Calculate']")).click();
 
			//Approch_3
}
		
		private static void selectOptionFromDropdown(WebElement ele, String value) {
			
			// TODO Auto-generated method stub
			Select drp = new Select(ele);
			List<WebElement> alloptions = drp.getOptions();
			for(WebElement option :alloptions)
			{
				if(option.getText().equals(value))
				{
					option.click();
					break;
				}
			}		
		}	
}
			
		
		
			
		
