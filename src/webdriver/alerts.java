package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	
WebDriver driver =null;
	
	public void browserselector(){
		System.out.println("Google chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
	
		driver = new ChromeDriver();
	}
	
	

	public void alerts1(){
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
	//	driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		driver.findElement(By.tagName("button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert box string is = " + alert.getText());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();
	}
	
	public void  popups(){
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
	//	driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert box string is = " + alert.getText());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	alert.accept();
		alert.dismiss();
		
		
	}
	
	public void dialogbox(){
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
	//	driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Jaya shukla");
		
		System.out.println("Prompt box string is = " + alert.getText());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();
		
	}
	public static void main(String[] args) {
		
		alerts a = new alerts();
		a.browserselector();
		
	//	a.alerts1();
	//	a.popups();
		a.dialogbox();
		
		
	}

}
