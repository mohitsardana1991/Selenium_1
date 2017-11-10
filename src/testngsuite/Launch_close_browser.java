package testngsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_close_browser {

	WebDriver driver;
	@BeforeMethod
	public void launch_Browser () throws Exception {
		String browserDriverExePath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", browserDriverExePath + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void close_Browser () throws Exception {
		driver.quit();
	}
}