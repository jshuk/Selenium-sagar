package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class advancexpathandcss {
WebDriver driver =null;
	
	public void browserselector(){
		System.out.println("Google chrome");
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new FirefoxDriver();
	}
	
	public void launchthepage(){
		driver.get("http://www.gmail.com");
	}
	
	public void advxpathcss() throws InterruptedException{
		
		//starts-with
	//	driver.findElement(By.xpath("//a[starts-with(@class,'need')]")).click();
		driver.findElement(By.xpath("//*[@id='view_container']/form/div[2]/div/div[1]/button")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		/*
		//contains 
		driver.findElement(By.xpath("//a[contains(@class,'ed-hel')]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		//text
		driver.findElement(By.xpath("//a[contains(text(),'Find my account')]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("refresh");
		driver.navigate().refresh();
		
		
	}
	*/
	}
	
public void advxpathcss1() throws InterruptedException{
		
		//starts-with
		driver.findElement(By.cssSelector("a[class^='need']")).click();
		System.out.println("1");
		driver.navigate().back();
		Thread.sleep(3000);
		//contains 
		
		driver.findElement(By.cssSelector("a[class*='ed-hel']")).click();
		System.out.println("2");
		driver.navigate().back();
		Thread.sleep(3000);
		//text
		driver.findElement(By.cssSelector("a[class$='help']")).click();
		System.out.println("3");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("refresh");
		driver.navigate().refresh();
		
		
	}


	public static void main(String[] args) throws InterruptedException  {
		
		advancexpathandcss i = new advancexpathandcss();
		i.browserselector();
		i.launchthepage();
		//i.advxpathcss();
		i.advxpathcss();
		

	}

}
