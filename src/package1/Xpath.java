package package1;


	import org.openqa.selenium.By;
	
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Xpath {
		
		 
			static
			{
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			}
			public static void main(String[] args) throws InterruptedException
			{
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://in.bookmyshow.com/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
				driver.findElement(By.xpath("//div[text()='Sign in']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9153223333");
				
}
}