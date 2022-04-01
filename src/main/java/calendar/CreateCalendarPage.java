package calendar;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import parent.parenttask.PageBase;

public class CreateCalendarPage extends PageBase{

	public CreateCalendarPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "eventTitle")
	WebElement EventTitle;

	@FindBy(id="eventDescription")
	WebElement EventDesc;
	
	@FindBy(xpath  = "//*[@id=\"Recipients\"]/div/div/div[3]/input")
	WebElement DDLInput;
	
	@FindBy(id ="af2a96fc5073-3" )
	WebElement item1;
	
	

	@FindBy(xpath = "/html/body/app-root/app-main-layout/main/app-create-event/div/div[2]/form/div/div/prt-date-picker/div/div/input")
	WebElement date;

	@FindBy(id = "timepickerEndTime")
	WebElement FromTime;

	@FindBy(id = "timepickerStartTime")
	WebElement ToTime;


	@FindBy(id = "submitCreateEventBtn")
	WebElement ClickSave;


	public void addEvent(String title,String description, String datee,String From,String to) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(FromTime));
		setTextElementText(EventTitle, title);
		setTextElementText(EventDesc, description);
		
		
		setTextElementText(date,datee );
		setTextElementText(FromTime, From);
		FromTime.sendKeys(Keys.ENTER);
		setTextElementText(ToTime, to);	
		
		clickButton(DDLInput);
		clickButton(item1);
		//clickButton(ClickSave);
	}

}
