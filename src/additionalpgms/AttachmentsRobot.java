package additionalpgms;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttachmentsRobot {

	
	public void attach(){
		try{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.2shared.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//driver.findElement(By.id("upField")).sendKeys("D:\\TrainingContent\\URLs.txt");
		driver.findElement(By.id("upField")).click();
		Thread.sleep(5000);
		 StringSelection ss = new StringSelection("Write here the path of the file to be attached");
	     //upload your file using RobotClass
	     //attach your path where file is located.
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     Robot robot = new Robot();
	     Thread.sleep(5000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     
	     Thread.sleep(6000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AttachmentsRobot a = new AttachmentsRobot();
		a.attach();
		
		
		
	}

}
