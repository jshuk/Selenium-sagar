package additionalpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pageScroll {

	WebDriver driver;
	
	private void init(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://news.google.com");
		driver.manage().window().maximize();
	}
	
	private void scrollToTop(){
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	private void scrollToBottom(){
		Actions action = new Actions(driver);
		
		
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(document.body.scrollHeight)", "");*/
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	

	private void scrollToCoord(){
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	}
	
	private void scrollToElement(){
		WebElement element = driver.findElement(By.partialLinkText("Pakistan government sacks"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pageScroll p = new pageScroll();
		try{
			p.init();
			p.scrollToBottom();
			Thread.sleep(4000);
			p.scrollToTop();
			Thread.sleep(4000);
			p.scrollToCoord();
			Thread.sleep(4000);
			p.scrollToElement();
			p.driver.quit();
			
		}catch(Exception e){
			
		}	
	}

}
