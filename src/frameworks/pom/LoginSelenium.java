package frameworks.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSelenium {

	WebDriver driver;
	
	@FindBy(id="Email")
	WebElement uname;
	
	@FindBy(id="next")
	WebElement next;
	
	@FindBy(id="Passwd")
	WebElement passwd;
	
	@FindBy(id="signIn")
	WebElement signin;
	
	public LoginSelenium(WebDriver testdriver){
		driver = testdriver;
		PageFactory.initElements(driver,this);
	}
	
    public void setUname(String email){
        uname.sendKeys(email);;
    }

    public void clickNext(){
        next.click();
    }
    public void setPassword(String pass){
         passwd.sendKeys(pass);
    }

    public void clickSignIn(){
            signin.click();
    }

    public String getPageTitle(){
    		return   driver.getTitle();
    }
    
    public void gmailLogin(String email, String pass){
    	try{
    		this.setUname(email);
    		this.clickNext();
    		Thread.sleep(2000);
    		this.setPassword(pass);
    		this.clickSignIn();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
	
}
