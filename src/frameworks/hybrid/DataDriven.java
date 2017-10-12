package frameworks.hybrid;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworks.hybrid.MainFrameWork;

public class DataDriven {

	MainFrameWork m;
	
	@Test(dataProvider="getData")
	public void loginTest(String uname, String passwd){
		System.out.println("Test case execution started");
		System.out.println("Username is : " + uname);
		System.out.println("Password is : " + passwd);
		String[] testData = new String[5];
		testData[0] = "http://www.gmail.com";
		testData[1] = uname;
		testData[2] = "";
		testData[3] = passwd;
		testData[4] = "";
		
		System.out.println("Test data for iteration");
		for(String k:testData){
			System.out.println(k);
		}
		
		WebDriver driver;
		driver = new FirefoxDriver();
		m = new MainFrameWork();
		String dataFile = "C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\New folder\\NOTES\\TestData\\hybrid.xlsx";
		m.executeSteps(driver,dataFile,0,testData);
		driver.close();
		System.out.println("Test case execution completed");
	}
	
	@DataProvider(name="getData")
	public Object[][] getData() throws FileNotFoundException{
		Object [][] data = null;
		
		String dataFile = "C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\New folder\\NOTES\\TestData\\loginDemo.xlsx";
		
		FileReader f = new FileReader();
		data = f.fetchData(dataFile);
		return data;
	}
}
