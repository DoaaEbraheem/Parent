package Institute;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import parent.parenttask.PageBase;

public class InstitutePage extends PageBase{

	public InstitutePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath =  "/html/body/app-root/app-main-layout/main/app-institution/div/div[2]/div/div[2]/div[1]/div[1]")
	WebElement firstInst;
			
	
	public void openInstitute() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(firstInst));
		
		clickButton(firstInst);

	}

}
