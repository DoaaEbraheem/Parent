package parent.parenttask;

import java.io.IOException;
import calendar.CalenderTest;
import calendar.CreateCalendarTest;
import institute.InstituteTest;
import institute.OverViewTest;

public class Secnario extends TestBase{

	LoginPageTest LoginPageTestObject;
	InstituteTest InstituteTestObject;
	OverViewTest OverViewTestObject;
	CalenderTest CalenderTestObject;
	CreateCalendarTest CreateCalendarTestObject;
	
	@org.testng.annotations.Test
	public void name() throws IOException, InterruptedException {
		LoginPageTestObject = new LoginPageTest();
		LoginPageTestObject.loginAsAdmin();
		
		
		InstituteTestObject= new InstituteTest();
		InstituteTestObject.Chooseinstitue();
		
		OverViewTestObject= new OverViewTest();
		OverViewTestObject.Opencalen();
		
		CalenderTestObject= new CalenderTest();
		CalenderTestObject.Calender();
		
		CreateCalendarTestObject = new CreateCalendarTest();
		CreateCalendarTestObject.CreateNewEvent();
		
		
		
		
		
	}
}
