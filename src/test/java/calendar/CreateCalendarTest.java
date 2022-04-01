package calendar;


import org.junit.Test;
import parent.parenttask.TestBase;

public class CreateCalendarTest extends TestBase {
	CreateCalendarPage CreateCalendarObject;
	
	String dateTime=faker .number().numberBetween(01, 29)+" Apr 22";
	int minutes= faker .number().numberBetween(01, 50);
	String Description=faker .name().fullName();
	
	@Test
	public void CreateNewEvent() throws InterruptedException {
		CreateCalendarObject = new CreateCalendarPage(driver);
		CreateCalendarObject.addEvent(namee,Description,dateTime,"01:"+minutes,"02:"+minutes);

	}

	
}
