package EventListenerss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class IAMDriver {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		EventFiringWebDriver eventfiringdriver = new EventFiringWebDriver(driver);
		IAmEventListener eventlistener = new IAmEventListener();
		eventfiringdriver.register(eventlistener);
		eventfiringdriver.get("http://www.google.com");
		eventfiringdriver.get("http://www.facebook.com");
		eventfiringdriver.navigate().back();
		
		

	}

}
