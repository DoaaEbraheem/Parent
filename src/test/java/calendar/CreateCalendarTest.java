package calendar;


import org.junit.Test;
import parent.parenttask.TestBase;

public class CreateCalendarTest extends TestBase {
	CreateCalendarPage CreateCalendarObject;
	String name=faker .name().firstName();
	String dateTime="01 Apr 22";
	String Description=faker .name().fullName();
	@Test
	public void CreateNewEvent() {
		CreateCalendarObject = new CreateCalendarPage(driver);
		CreateCalendarObject.addEvent(name,Description,dateTime,"01:00","02:00");

	}

	
}
