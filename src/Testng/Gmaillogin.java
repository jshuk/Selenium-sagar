package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Gmaillogin {
	WebDriver driver = null;
	
	@BeforeMethod(alwaysRun=true)
	public void beforemethod(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test (groups = {"T1"})
	public void test1() throws InterruptedException{
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("jshuk2011@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("oct@2016");
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(5000);
        
	}
	
	
	
	@Test(dataProvider="Inputdata")
	public void test2(String id,String password) throws InterruptedException{
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys(id);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(10000);
        
        String str=driver.getTitle();
        
        if(!str.contains("Inbox")){
        	System.out.println("Failed");
        	Assert.assertTrue(false);
			
        } 
        
        		
        System.out.println("completed");
		
	}
	
	@DataProvider(name="Inputdata")
	public Object[][] Inputdata(){
		
		Object[][] obj = { {"jshuk2011@gmail.com","oct@2016"},{"charu.smartest@gmail.com","jshhhhh"}};
		return obj;
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void aftermethod(){
		driver.quit();
	}

}
