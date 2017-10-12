package frameworks.advance;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentExample {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	int i=1;
	
	@BeforeSuite
	public void setUp(){
		// starting test
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
		Date date = new Date();
		String today = dateFormat.format(date);
		String logDir = "C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\New folder\\" ;
		String logFile = logDir + "Index.html";
		extent = new ExtentReports(logFile, true); // true - overwrite
	}
	@AfterSuite
	public void tearDown(){
		// writing everything to document
		extent.flush();
	}
	
	@BeforeMethod
	public void testSetup(Method method){
		test = extent.startTest(method.getName(), "Sample description");
	}
	@AfterMethod
	public void testTearDown(){
		// ending test
		extent.endTest(test);
		// writing everything to document
		extent.flush();
		driver.close();
	}
	
	public void takeSS(){
		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\New folder\\testScreenShot_"+i+".jpg"));
			
			//test.addScreenCapture("/Users/sagarsaibi/Documents/workspace/practiceProject/extentOutput/testScreenShot.jpg");
			test.log(LogStatus.PASS, "Take screenshot" +
					test.addScreenCapture("C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\New folder\\testScreenShot_"+i+".jpg"));
			i++;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void seleniumTest2(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		try {
			driver.get("http://www.gmail.com");
			// step log
			test.log(LogStatus.PASS, "Launch browser");
			driver.findElement(By.id("Email")).sendKeys("seleniumtestacnt");
			test.log(LogStatus.PASS, "Enter gmail ID");
			takeSS();
			driver.findElement(By.id("next")).click();
			test.log(LogStatus.PASS, "Click Next");
			takeSS();
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"");
			takeSS();
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void seleniumTest1(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		try {
			driver.get("http://www.gmail.com");
			// step log
			test.log(LogStatus.PASS, "Launch browser");
			driver.findElement(By.id("Email")).sendKeys("seleniumtestacnt");
			test.log(LogStatus.PASS, "Enter gmail ID");
			takeSS();
			driver.findElement(By.id("nextasd")).click();
			test.log(LogStatus.PASS, "Click Next");
			takeSS();
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"");
			takeSS();
			e.printStackTrace();
		}
		
	}
	
}
