package calendar;


import java.nio.file.Path;
import java.nio.file.Paths;

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
	static Path dest = Paths.get("../Screenshots/");
	@FindBy(id = "eventTitle")
	WebElement EventTitle;

	@FindBy(id="eventDescription")
	WebElement EventDesc;

	@FindBy(xpath  = "/html/body/app-root/app-main-layout/main/app-create-event/div/div[2]/form/div/div/div[1]/prt-upload-capture-button/div[1]/button")
	WebElement imageclick;


	@FindBy(id="imageInput")
	WebElement up;

	@FindBy(id="modalMainBtn")
	WebElement popupclose;

	@FindBy(xpath = "/html/body/app-root/app-main-layout/main/app-create-event/div/div[2]/form/div/div/prt-date-picker/div/div/input")
	WebElement date;

	@FindBy(id = "timepickerEndTime")
	WebElement ToTime;

	@FindBy(id = "timepickerStartTime")
	WebElement FromTime;

	@FindBy(xpath = "//*[@id=\"Recipients\"]/div/div/div[2]/input")
	WebElement Recipientsclick;

	@FindBy(id="option_0")
	WebElement Recipientschoose;
	
	@FindBy(id="reminder_before_event__wrapper")
	WebElement Remember;

	@FindBy(id = "submitCreateEventBtn")
	WebElement ClickSave;


	public void addEvent(String title,String description, String datee,String From,String to) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(FromTime));

		clickButton(imageclick);

		up.sendKeys("/Screenshots/samsung.jpg");
		Thread.sleep(3000);
		clickButton(popupclose);
		setTextElementText(EventTitle, title);
		setTextElementText(EventDesc, description);
		
		setTextElementText(date,datee );
		setTextElementText(FromTime, From);
		FromTime.sendKeys(Keys.ENTER);
		setTextElementText(ToTime, to);	
		ToTime.sendKeys(Keys.ENTER);
		clickButton(Recipientsclick);
		clickButton(Recipientschoose);
		//clickButton(Remember);
		//clickButton(ClickSave);
	}

}
