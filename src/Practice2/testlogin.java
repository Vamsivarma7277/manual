package Practice2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Practice1.loginpage;



public class testlogin {
	WebDriver driver;

	@BeforeTest
	void setup()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91915\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	@BeforeClass
	void launchURL()
	{
	driver.get("https://practicetestautomation.com/practice-test-login/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	void loginTest()
	{
		loginpage ip = new loginpage();
    ip.setcrededentials("student","Password123");
    ip.login();
    

}
}