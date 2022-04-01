package parent.parenttask;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver;
	public Actions action ;
	public static Select dropdown;

	// public static Select Drop down;
	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	protected static void setTextElementText(WebElement textElement, String value) {
		textElement.sendKeys(value);
	}

	protected static void clearinput(WebElement input) {
		input.clear();
	}

	protected static void selectDropdownmenu(WebElement selectvalue, String text) {
		dropdown = new Select(selectvalue);
		dropdown.selectByVisibleText(text);

	}

	protected static void selectDropdownmenubyvalue(WebElement selectvalue, String text) {
		selectvalue.click();
		dropdown = new Select(selectvalue);
		dropdown.selectByValue(text);

	}
	public void scrollToBottom() 

	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,2500)",""); 
	}

	protected static void clickButton(WebElement button) 
	{
		button.click();
	}
}
