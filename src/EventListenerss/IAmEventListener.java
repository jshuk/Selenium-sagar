package EventListenerss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class IAmEventListener extends AbstractWebDriverEventListener {
	@Override
	public void beforeNavigateTo(String URL,WebDriver driver){
		System.out.println("Before Naviagate To " + URL + "and current url is "+driver.getCurrentUrl());
		}
	
	@Override
	public void beforeNavigateBack(WebDriver driver){
		System.out.println("I am at"+driver.getCurrentUrl());
	}
	
	

}
