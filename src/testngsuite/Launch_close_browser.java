package testngsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_close_browser {

	WebDriver driver;
	@BeforeMethod
	public void launch_Browser () throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void close_Browser () throws Exception {
		driver.quit();
	}
}