package package2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleingdropdown2 {
	
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args)
		{
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.calculator.net/date-calculator.html");
	WebElement today2_Month_ID = driver.findElement(By.xpath("//select[@id='today2_Month_ID']"));
	WebElement today2_Day_ID = driver.findElement(By.xpath("//select[@id='today2_Day_ID']"));
	WebElement addition = driver.findElement(By.xpath("//select[@id='c2op']"));
	 driver.findElement(By.xpath("//select[@id='today2_Day_ID']")).sendKeys("02");
	 driver.findElement(By.xpath("//input[@id='c2month']")).sendKeys("02");
	 driver.findElement(By.xpath("//input[@id='c2week']")).sendKeys("02");
	 driver.findElement(By.xpath("//input[@id='c2day']")).sendKeys("02");
	 
	 Select sel = new Select(today2_Month_ID);
	 sel.selectByIndex(1);
	 
	 Select sel1 = new Select(today2_Day_ID);
	 
	 
	 
	 
	 
	 
	 
	 
}
}