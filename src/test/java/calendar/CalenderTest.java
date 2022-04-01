package calendar;

import org.junit.Test;

import parent.parenttask.TestBase;

public class CalenderTest extends TestBase{
	CalenderPage CalenderObject;
	
	@Test
	public void Calender() {
		CalenderObject=new CalenderPage(driver);
		CalenderObject.openaddnew();
		
	}
	
	@Test
	public void Checkeventname() {
		
		CalenderObject=new CalenderPage(driver);
		CalenderObject.findEvent("Event: "+namee);
	}

}
