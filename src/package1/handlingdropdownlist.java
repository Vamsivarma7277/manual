package package1;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class handlingdropdownlist {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.calculator.net/date-calculator.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement today_Month_ID = driver.findElement(By.id("today_Month_ID"));
			WebElement today_Day_ID = driver.findElement(By.id("today_Day_ID"));
			WebElement ageat_Month_ID = driver.findElement(By.id("ageat_Month_ID"));
			WebElement ageat_Day_ID = driver.findElement(By.id("ageat_Day_ID"));
			
//Approach_1
			//Select sel = new Select(today_Month_ID);
			//sel.selectByIndex(8);
			
		//	Select sel_1 = new Select(today_Day_ID);
		//	sel_1.selectByIndex(0);
			
			//Select sel_3 = new Select(ageat_Month_ID);
			//sel_3.selectByIndex(2);
			
			//Select sel_4 = new Select(ageat_Day_ID);
			//sel_4.selectByIndex(20);	
			
			//driver.findElement(By.xpath("//span[@class='cbmark']")).click();
			//driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		    
//Apporach2
			 Select sel =new Select(today_Month_ID);
			     List<WebElement> alloptions = sel.getOptions();
			     
			     for(WebElement option : alloptions)
			    {
		   
		   if(option.getText().equals("Apr"))
		   {
			   option.click();
			   break;
		   }
			     }	
			    

		Select sel1 =new Select(today_Day_ID);
				    alloptions= sel1.getOptions();
				    for(WebElement option : alloptions)
				     {
			    if(option.getText().equals("3"))
			  {
				   option.click();
				   break;
			   }
			     }
	Select sel2 =new Select(ageat_Month_ID);
				     alloptions=sel2.getOptions();
				     
			     for(WebElement option : alloptions)
				     {
			   
			   if(option.getText().equals("Aug"))
			   {
				   option.click();
				   break;
			   }
				     }	
				     Select sel3 =new Select(ageat_Day_ID);
				     alloptions=sel3.getOptions();
				     
				     for(WebElement option : alloptions)
				     {
			   
			   if(option.getText().equals("4"))
			   {
				   option.click();
				   break;
			   }
				     }	
				     
			     
				    driver.findElement(By.xpath("//span[@class='cbmark']")).click();
					driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		}
}