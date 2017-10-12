package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attachments {
	
	WebDriver driver =null;
	
	public void browserselector(){
		System.out.println("Google chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
	    driver = new ChromeDriver();	    	}
	
	public void upload() throws InterruptedException, AWTException{
		driver.get("https://encodable.com/uploaddemo/");
	//	driver.findElement(By.id("uploadname1")).sendKeys("C:\\New folder\\selenium.txt");
		
		
		/*
		 * We are using robot class for keys
		 */
		driver.findElement(By.id("uploadname1")).click();
		Thread.sleep(3000);
		StringSelection ss =new StringSelection("C:\\New folder\\selenium.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
	driver.findElement(By.id("formfield-email_address")).sendKeys("jshuk2011@gmail.com");
	driver.findElement(By.id("formfield-first_name")).sendKeys("jaya");
	driver.findElement(By.id("uploadbutton")).click();
		
		}

	public static void main(String[] args) throws InterruptedException, AWTException {
		attachments a = new attachments();
		a.browserselector();
		a.upload();	
	}

}
