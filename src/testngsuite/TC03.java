package testngsuite;

import org.junit.Test;
import org.testng.Reporter;

public class TC03 extends Launch_close_browser{
	@Test
	public void testCricinfo()throws Exception {
		
		driver.get("http://www.cricinfo.com")	;
		Reporter.log(driver.getTitle());

	}
}