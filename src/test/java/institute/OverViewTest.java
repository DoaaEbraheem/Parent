package institute;

import org.junit.Test;
import Institute.OverViewPage;
import parent.parenttask.TestBase;

public class OverViewTest extends TestBase{
	OverViewPage overviewobject;
	@Test
	public void Opencalen() {
		
		overviewobject = new OverViewPage(driver);
		overviewobject.openCalender();
	}

}
