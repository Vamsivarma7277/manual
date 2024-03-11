package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;



public class navigation {
	

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	   public static void main(String[] args) throws InterruptedException {
	
	
		WebDriver driver = new ChromeDriver();
//		       Navigation nav = driver.navigate();
		         driver.get("https://www.facebook.com/");
		//         nav.forward();
//		         nav.back();
	//	         nav.refresh();
		         
		}	
}
