package parent.parenttask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "txtEmail")
	WebElement Email;

	@FindBy(id = "txtPassword")
	WebElement Password;

	@FindBy(id = "submitBtn")
	WebElement loginButton;
	
	public void LoginwithAdmin(String mail , String pass) {
		setTextElementText(Email, mail);
		setTextElementText(Password, pass);
		clickButton(loginButton);
	}
   
}
