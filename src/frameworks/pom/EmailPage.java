package frameworks.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPage {

	WebDriver driver;
	
	public EmailPage(WebDriver testdriver){
		driver = testdriver;
	}

    public String getPageTitle(){
    		return   driver.getTitle();
    }
    
    
	
}
