package seleniumswitch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

	

		public class ArraySoting {
			WebDriver driver;
			
			@Before
			public void openBrowser(){
				String browserDriverExePath = System.getProperty("user.dir");
				System.out.println(browserDriverExePath);
				
				/*System.setProperty("webdriver.gecko.driver", browserDriverExePath + "//Drivers//geckodriver.exe");
				driver = new FirefoxDriver();*/
				
				System.setProperty("webdriver.chrome.driver", browserDriverExePath + "//Drivers//chromedriver.exe");
				driver = new ChromeDriver();
				
				/*driver.manage().window().maximize();
				driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/interactions/Actions.html");
			*/
			
				driver.get("http://www.seleniumhq.org");
				
			}
			
		
			
			@Test
			
				public void task01 () throws Exception{
				
				int frameSize = driver.findElements(By.tagName("frame")).size();
				
				System.out.println(frameSize);
				
				/*for(int i = 0; i<frameSize; i++){
					driver.switchTo().frame(i).get
				}*/
				
			    driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
			    driver.findElement(By.xpath("//a[@href='org/openqa/selenium/remote/server/handler/AddCookie.html']")).click();
			    System.out.println("hiiiii3");
			    /*driver.findElement(By.id("userName")).sendKeys("8527432891");
			    System.out.println("hiiiii2");*/
			    }
				
			
			@After
			public void quitBrowser(){
				//driver.quit();
			}
		}