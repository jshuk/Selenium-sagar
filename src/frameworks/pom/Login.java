package frameworks.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;
	
	By uname = By.id("Email");
	By next = By.id("next");
	By passwd = By.id("Passwd");
	By signin = By.id("signIn");
	
	public Login(WebDriver testdriver){
		driver = testdriver;
	}
	
    public void setUname(String email){
        driver.findElement(uname).sendKeys(email);
    }

    public void clickNext(){
        driver.findElement(next).click();
    }
    public void setPassword(String pass){
         driver.findElement(passwd).sendKeys(pass);
    }

    public void clickSignIn(){
            driver.findElement(signin).click();
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
