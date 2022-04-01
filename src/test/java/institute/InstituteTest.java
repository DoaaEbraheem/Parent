package institute;

import org.junit.Test;

import Institute.InstitutePage;
import parent.parenttask.TestBase;

public class InstituteTest extends TestBase{
	InstitutePage institutepageObject;
	
	@Test
	public void Chooseinstitue() {
		
		institutepageObject = new InstitutePage(driver);
		institutepageObject.openInstitute();
	}

}
