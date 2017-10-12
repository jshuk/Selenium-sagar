package additionalpgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	WebDriver driver;
	
	private void init(){
		System.setProperty("webdriver.chrome.driver","/Users/sagarsaibi/Documents/Webonise/QA/Automation/DrfLiveNewsRiver-0/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.destinationqa.com/aut/AlertsPopups.html");
	}
	
	private void prompt(){
		try{
			driver.findElement(By.id("btnPrompt")).click();
			Alert alert = driver.switchTo().alert();
			driver.switchTo().alert().sendKeys("MyString");
			System.out.println("Prompt box string is : " + alert.getText());
			Thread.sleep(2000);
			alert.accept();
		}catch(Exception e){
			
		}
	}
	
	private void alert(){
		try{
			driver.findElement(By.id("btnAlert")).click();
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert box string is : " + alert.getText());
			Thread.sleep(2000);
			alert.accept();
		}catch(Exception e){
			
		}
	}
	
	private void confirmationBox(){
		
		try{
			driver.findElement(By.id("btnConfirm")).click();
			Alert alert = driver.switchTo().alert();
			System.out.println("Confirmation box string is : " + alert.getText());
			Thread.sleep(2000);
			alert.accept();
			Thread.sleep(4000);
			
			driver.findElement(By.id("btnConfirm")).click();
			alert = driver.switchTo().alert();
			System.out.println("String is : " + alert.getText());
			Thread.sleep(2000);
			alert.dismiss();
		}catch(Exception e){
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptAlerts j = new JavaScriptAlerts();
		try{
			j.init();			
			//j.confirmationBox();
			Thread.sleep(4000);
			//j.alert();
			//Thread.sleep(4000);
			j.prompt();
		}catch(Exception e){
			
		}
	}

}
