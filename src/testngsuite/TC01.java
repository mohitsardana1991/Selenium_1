package testngsuite;

import org.junit.Test;
import org.testng.Reporter;

public class TC01 extends Launch_close_browser{
	@Test
	public void testGoogle()throws Exception {
		
		driver.get("http://www.google.com")	;
		Reporter.log(driver.getTitle());

	}
}