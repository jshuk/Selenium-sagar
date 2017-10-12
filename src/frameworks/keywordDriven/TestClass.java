package frameworks.keywordDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass {

	MainFrameWork m;
	
	@Test
	public void loginTest(){
		WebDriver driver;
		driver = new FirefoxDriver();
		m = new MainFrameWork();
		String dataFile = "C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\New folder\\NOTES\\TestData\\KeywordTest2.xlsx";
		m.executeSteps(driver,dataFile,0);
	}
}
