package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectlist {
	
	WebDriver driver =null;
	
	public void browserselector(){
		System.out.println("Google chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void launchthepage(){
		driver.get("http://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
	}
	
	public void selectitemsfromlist() throws InterruptedException{
		
		driver.findElement(By.id("ctl00_ContentPlaceholder1_RadListBoxSource_i2")).click();
		driver.findElement(By.cssSelector("button[title='To Right']")).click();
	    driver.findElement(By.id("ctl00_ContentPlaceholder1_RadListBoxSource_i4")).click();
	    driver.findElement(By.cssSelector("button[title='To Right']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_RadListBoxDestination']/div[2]/ul/li")).click();
	    driver.findElement(By.cssSelector("button[title='To Left']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_RadListBoxDestination']/div[2]/ul/li")).click();
	    driver.findElement(By.cssSelector("button[title='To Left']")).click();
	    
		
	}

	public static void main(String[] args) throws InterruptedException {
		selectlist i = new selectlist();
		i.browserselector();
		i.launchthepage();
		i.selectitemsfromlist();

	}

}
