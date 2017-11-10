package testngsuite;

import org.junit.Test;
import org.testng.Reporter;

public class TC02 extends Launch_close_browser{
	@Test
	public void testGmails()throws Exception {
		
		driver.get("http://www.gmail.com")	;
		Reporter.log(driver.getTitle());

	}
}