package webdriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipletabs {

WebDriver driver =null;
	
	public void browserselector(){
		System.out.println("Google chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void launchthepage(){
		driver.get("https://www.w3schools.com/colors/");
	}
	
	public void openall() throws InterruptedException{
		List<WebElement> ListLinks = driver.findElements(By.partialLinkText("Try it Yourself"));
		System.out.println("Number of links = "+ ListLinks.size());
		for(WebElement e: ListLinks)
			e.click();
		Thread.sleep(3000);
	}
	
	public void closeall(){
		driver.quit();
	}

	public void switchwindow() throws InterruptedException{
		Set<String> windowHandles=driver.getWindowHandles();
		windowHandles.size();
		System.out.println("Number of open windows are " +windowHandles.size());
		int i=1;
		for(String s:windowHandles){
			driver.switchTo().window(s);
			System.out.println("Title of"+i+"window is"+driver.getTitle());
			System.out.println("URL of"+i+"window is "+driver.getCurrentUrl());
			i++;
			Thread.sleep(4000);
		}
		
	}



public static void main(String[] args) throws InterruptedException{
	multipletabs m = new multipletabs();
	m.browserselector();
	m.launchthepage();
	m.openall();
//	m.closeall();
	m.switchwindow();
}
}

