package frameworks.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase {

	WebDriver driver;
	
	@Test
	public void loginTest(){
		
		try{
			driver = new FirefoxDriver();
			driver.get("http://www.gmail.com");
			
			Login objLogin = new Login(driver);
			//LoginSelenium objLogin = new LoginSelenium(driver);
			objLogin.gmailLogin("seleniumtestacnt","Test@123");
			Thread.sleep(10000);
			EmailPage objEmail = new EmailPage(driver);
			Assert.assertTrue(objEmail.getPageTitle().contains("Inbox"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
