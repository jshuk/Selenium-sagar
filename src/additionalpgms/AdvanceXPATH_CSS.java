package additionalpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXPATH_CSS {

	WebDriver driver;
	public void init(){
		System.setProperty("webdriver.chrome.driver","/Users/sagarsaibi/Documents/Webonise/QA/Automation/DrfLiveNewsRiver-0/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
	}

	public void CSS(){
		
		try{
			
			driver.findElement(By.cssSelector("a[class='need']")).click();
			//starts-with
			driver.findElement(By.cssSelector("a[class^='need']")).click();
			driver.navigate().back();
			Thread.sleep(3000);
			//contains
			driver.findElement(By.cssSelector("a[class*='ed-he']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			//ends-with
			driver.findElement(By.cssSelector("a[class$='help']")).click();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void xpathStartsWith(){
		
		try{
			
			driver.findElement(By.xpath("//a[@class='need-help']")).click();
			
			//starts-with
			driver.findElement(By.xpath("//a[starts-with(@class,'need')]")).click();
			driver.navigate().back();
			Thread.sleep(3000);
			
			//contains
			driver.findElement(By.xpath("//a[contains(@class,'ed-he')]")).click();
			driver.navigate().back();
			Thread.sleep(3000);
			//text
			driver.findElement(By.xpath("//a[contains(text(),'Find my account')]")).click();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvanceXPATH_CSS a = new AdvanceXPATH_CSS();
		a.init();
		a.CSS();		
	}

}
