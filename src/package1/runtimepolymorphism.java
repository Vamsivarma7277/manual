package package1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class runtimepolymorphism {
	
public static WebDriver driver;
public static void main (String[] args)
{
System.out.println("Enter the browser to open");
Scanner scan = new Scanner(System.in);
String input = scan.next();

if(input.equalsIgnoreCase("CB"))
{
	System.setProperty("webDriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
}
else if(input.equalsIgnoreCase("FF"))
{
	System.setProperty("webDriver.gecko.driver", "./driver/geckodriver.exe");
	driver=new FirefoxDriver();
	
}
else
{
	System.out.println("Invalid input");
}
driver.get("https://www.facebook.com/");
driver.close();
}
}