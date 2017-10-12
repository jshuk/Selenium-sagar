package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondcls {
	
	WebDriver driver = null;
	
	
	public void entry() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.className("gsfi")).sendKeys("Selenium");
		driver.findElement(By.className("sbico")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("Previous Releases")).click();
		Thread.sleep(5000);
	    driver.findElement(By.linkText("2.47")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("IEDriverServer_Win32_2.47.0.zip")).click();
	}
	

	public static void main(String[] args) throws InterruptedException {
		secondcls sc = new secondcls();
		sc.entry();
	}

}
