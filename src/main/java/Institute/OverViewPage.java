package Institute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import parent.parenttask.PageBase;

public class OverViewPage extends PageBase{

	public OverViewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "calendarTab")
	WebElement calendertab;
	
	public void openCalender() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(calendertab));
		clickButton(calendertab);
	
		

	}

}
