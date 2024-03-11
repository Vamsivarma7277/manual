package package1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class programme2 {
	
		
		 
		static
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}
		public static void main(String[] args)
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
	}

