package parent.parenttask;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;




public class LoginPageTest extends TestBase
{
	LoginPage LoginpageObject;
 
	@Test(priority = 1)
	public void loginAsAdmin() throws IOException, InterruptedException {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("resources\\test.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String email = prop.getProperty("admin");
		String password = prop.getProperty("password");
		LoginpageObject = new LoginPage(driver);
		LoginpageObject.LoginwithAdmin(email, password);
		
	

	}

}
