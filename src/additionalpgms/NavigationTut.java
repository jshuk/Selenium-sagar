package additionalpgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTut {

	WebDriver driver;
	
	private void init(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/css/css_background.asp");
	}
	
	private void navigate(){
		try{
			driver.navigate().to("http://google.com");
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().forward();
			Thread.sleep(4000);
			driver.navigate().refresh();
		}catch(Exception e){
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationTut n = new NavigationTut();
		n.init();
		n.navigate();
	}

}
