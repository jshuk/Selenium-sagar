package frameworks.advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//An explicit waits is code you define to wait for a certain condition to 
//occur before proceeding further in the code.
public class MyExplicitWait {
	
	
	@Test
	public void test(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		
		//Implicit	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		//Explicit
		WebElement myElement = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions.presenceOfElementLocated
						(By.id("next")));
		
		
//		myElement.
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.withMessage("I am waiting");
//		driver.findElement(By.xpath("//input[@class='gsfi']"));
		
		
	}

}
