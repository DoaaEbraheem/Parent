package calendar;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.beust.jcommander.internal.Console;

import net.bytebuddy.asm.Advice.Return;
import parent.parenttask.LoginPage;
import parent.parenttask.PageBase;

public class CalenderPage extends PageBase{

	public CalenderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="createEventBtn")
	WebElement createcalendar;
	
	@FindBy(className ="icon-btn__label")
	List<WebElement> eventname;
	
	public void openaddnew() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(createcalendar));
		clickButton(createcalendar);
	}
	
	public boolean findEvent(String title) 
	{
		boolean flag=false;
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(createcalendar));
		for (WebElement webt : eventname) {
			
			if (title ==webt.getText()) {
				flag=true;
				break;
				
			}
		}
		
		return flag;
		
		
	}

}
