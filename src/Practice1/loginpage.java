package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	
	@FindBy (id="username") 
	private WebElement UsernameTB;

	@FindBy (id="password")
	private WebElement PasswordTB;

	@FindBy (id="submit")
	private WebElement Submitbtn;
	
	public void LoginPage(WebDriver driver)
	{
this.driver = driver;
PageFactory.initElements(driver, this);
    }
	public void setcrededentials(String EnteruserName, String EnterPassword)
	{
	UsernameTB.sendKeys(EnteruserName);
	PasswordTB.sendKeys(EnterPassword);
	}
	public void login()
	{
	Submitbtn.click();
	}
}