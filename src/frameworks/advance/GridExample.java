package frameworks.advance;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExample {

	@Test
	public void test1() throws MalformedURLException, InterruptedException{
		WebDriver driver = null;
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities =DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		URL nodeURL = new URL("http://localhost:4444/wd/hub");
		driver = new RemoteWebDriver(nodeURL, capabilities);
		
		driver.get("http://www.google.com");
		Thread.sleep(10000);
		System.out.println("test1: Google: ");
		driver.quit();
	}
	
	@Test
	public void test2() throws MalformedURLException, InterruptedException{
		
		WebDriver driver = null;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities =DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		URL nodeURL = new URL("http://localhost:4444/wd/hub");
		driver = new RemoteWebDriver(nodeURL, capabilities);
		
		driver.get("http://www.gmail.com");
		Thread.sleep(10000);
		System.out.println("test2: Gmail: ");
		driver.quit();
	}
}
