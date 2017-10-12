package additionalpgms;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	WebDriver driver;
	
	private void init(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("http://www.amazon.in/s/ref=nb_sb_noss_2?url=search-alias%3Delectronics&field-keywords=mobiles");
		//driver.get("http://www.jqueryscript.net/demo/jQuery-Based-Multi-Select-Enhancement-Plugin-multiselectsplitter-js/");
	}
	
	private void byValue(){
	
		/*
		 * This code is to select values from amazon page
		 * 
		 * WebElement element=driver.findElement(By.name("url"));
		//driver.findElement(By.linkText("Gift Cards")).click();
		Select se=new Select(element);
		se.selectByValue("search-alias=appliances");
		
		
		 element=driver.findElement(By.name("sort"));
		//driver.findElement(By.linkText("Gift Cards")).click();
		 se=new Select(element);
		se.selectByValue("price-desc-rank");*/
		
		//This code is to select values from codexworld page
		
		WebElement element=driver.findElement(By.id("regular"));
		Select se=new Select(element);
		se.selectByValue("1");
	}
	
	private void byIndex(){
		/*WebElement element=driver.findElement(By.name("sort"));
		//driver.findElement(By.linkText("Gift Cards")).click();
		Select se=new Select(element);
		se.selectByIndex(1);*/
		
		WebElement element=driver.findElement(By.id("regular"));
		//driver.findElement(By.linkText("Gift Cards")).click();
		Select se=new Select(element);
		se.selectByIndex(1);
	}
	
	private void byVisibleText(){
		/*WebElement element=driver.findElement(By.name("url"));
		//driver.findElement(By.linkText("Gift Cards")).click();
		Select se=new Select(element);
		se.selectByVisibleText("Car & Motorbike");*/
		
		WebElement element=driver.findElement(By.id("regular"));
		//driver.findElement(By.linkText("Gift Cards")).click();
		Select se=new Select(element);
		se.selectByVisibleText("Choice 3");
	}
	
	private void deselectByValue(){
		WebElement element=driver.findElement(By.id("regular"));
		Select se=new Select(element);
		se.deselectByValue("3");
	}
	
	private void deselectByIndex(){
		WebElement element=driver.findElement(By.id("regular"));
		//driver.findElement(By.linkText("Gift Cards")).click();
		Select se=new Select(element);
		se.deselectByIndex(1);
	}
	
	private void deselectByVisibleText(){
		WebElement element=driver.findElement(By.id("regular"));
		//driver.findElement(By.linkText("Gift Cards")).click();
		Select se=new Select(element);
		se.selectByVisibleText("Choice 1");
	}
	
	private void deselectAll(){
		WebElement element=driver.findElement(By.id("regular"));
		//driver.findElement(By.linkText("Gift Cards")).click();
		Select se=new Select(element);
		se.deselectAll();
	}
	
	private void getOptions(){
		WebElement element=driver.findElement(By.id("regular"));
		Select se=new Select(element);
		System.out.println("Listing all possible options");
		List<WebElement> eList =  se.getOptions();
		for(WebElement e:eList){
			System.out.println(e.getText());
		}
	}
	
	private void getAllSelectedOptions(){
		WebElement element=driver.findElement(By.id("regular"));
		Select se=new Select(element);
		System.out.println("Listing all selected options");
		List<WebElement> eList =  se.getAllSelectedOptions();
		for(WebElement e:eList){
			System.out.println(e.getText());
		}
	}
	
	private void getFirstSelectedOption(){
		WebElement element=driver.findElement(By.id("regular"));
		Select se=new Select(element);
		System.out.println("First selected option is :");
		WebElement e =  se.getFirstSelectedOption();
		System.out.println(e.getText());
		
	}
	
	private void isMultiple(){
		
		driver.get("http://www.amazon.in/s/ref=nb_sb_noss_2?url=search-alias%3Delectronics&field-keywords=mobiles");
		
		WebElement element=driver.findElement(By.name("url"));
		Select se=new Select(element);
		if(se.isMultiple())
		{
			System.out.println("Select tag allows multiple selection");	
		}
		else
		{
			System.out.println("Select does not allow multiple selections");
		}
		
		driver.navigate().to("http://www.jqueryscript.net/demo/jQuery-Based-Multi-Select-Enhancement-Plugin-multiselectsplitter-js/");
		
		element=driver.findElement(By.id("regular"));
		se=new Select(element);
		if(se.isMultiple())
		{
			System.out.println("Select tag allows multiple selection");	
		}
		else
		{
			System.out.println("Select does not allow multiple selections");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown d = new DropDown();
		d.init();
		
		d.isMultiple();
		System.exit(0);
		
		d.byValue();
		d.byIndex();
		//d.byVisibleText();
		//d.byVisibleText();
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
		d.getOptions();
		d.getAllSelectedOptions();
		d.getFirstSelectedOption();
		
		//d.deselectAll();
		//d.deselectByIndex();
		//d.deselectByVisibleText();
		//d.deselectByValue();
	}

}
