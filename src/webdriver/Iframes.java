package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	WebDriver driver = null;
	
	
	
	public void browserselection(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void launchpage(){
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_cols");
		
	}
	
	public void findframebywebelement(){
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		System.out.println(driver.getPageSource());
	}
	
	public void findframebyname(){
		driver.switchTo().frame("iframeResult");
	//	System.out.println(driver.getPageSource());
	}

	public void findbyindex(){
		
		driver.switchTo().frame(2);
	//	System.out.println(driver.getPageSource());
	//	driver.switchTo().parentFrame();
		//take u one level up
		driver.switchTo().defaultContent();
		//take u to the root whole web page will be displayed
		System.out.println(driver.getPageSource());
		
		
		
	}
	public static void main(String[] args) {
		Iframes i = new Iframes();
		i.browserselection();
		i.launchpage();
		i.findframebyname();
		i.findbyindex();
	}
	

}
