package webdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class gmaillogin {
	
	WebDriver driver = null;
	
  public void selectbrowser(String browser) throws InterruptedException{
		
		switch(browser){
		case "Firefox":
			System.out.println("Mozilla Firefox");
			driver = new FirefoxDriver();
			driver.get("https://www.youtube.com/watch?v=NQgLhZmz7dc");
			break;
			
			
		case "IE":
			System.out.println("internet explorer");
			System.setProperty("webdriver.ie.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			test1();
			break;
			
			
		case"chrome":
			System.out.println("Google chrome");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
			driver = new ChromeDriver();
			test1();
			break;
			
			
		case"Signup":
			test2();
			break;
			
		case"radiobutton":
		test3();
		break;
		
		case"checkbox":
		test4();
		break;
			
	    default:
				System.out.println("no input");
		}
	}
	
	
	
	
	public void test1() throws InterruptedException{
		
		driver.get("http://www.gmail.com");
	//	driver.findElement(By.id(objectrepocls.email)).sendKeys("jshuk2011@gmail.com");
		
		
		driver.findElement(objectrepocls.getObject(objectrepocls.email)).sendKeys("jshuk2011@gmail.com");
		driver.findElement(objectrepocls.getObject(objectrepocls.next1)).click();
		
		
	//	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jshuk2011@gmail.com");
	//	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("jshuk2011@gmail.com");
		//this will return webelement
	//	e.sendKeys("jshuk2011@gmail.com");
		
	
//	driver.findElement(By.id("identifierNext")).click();
	
	    Thread.sleep(5000);
    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("oct@2016");
        driver.findElement(By.id("passwordNext")).click();
        
		}
	
	public void check(String str){
		if(str.contains("Inbox"))
			System.out.println("Pass");
		
		else
			System.out.println("fail");
	}
	
	
	public void test2(){

		System.out.println("Google chrome SignUp");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		//driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		
	}
	
	public void test3(){
		System.out.println("w3schools");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	//	driver.findElement(By.name("gender")).click();
	// 	driver.findElements(By.name("gender")).get(2).isSelected();
	 	boolean ischeck =driver.findElements(By.name("gender")).get(2).isSelected();
	 	System.out.println("value before click is  " + ischeck);
	 	driver.findElements(By.name("gender")).get(2).click();
	 	ischeck=driver.findElements(By.name("gender")).get(2).isSelected();
	 	System.out.println("value after click is  " + ischeck);
	 	
	 	if(!ischeck)
	 		driver.findElements(By.name("gender")).get(2).click();
	 	else
	 		System.out.println("no need");
	 	
	}
	public void test4() throws InterruptedException{
		
		System.out.println("w3schools");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/Html/tryit.asp?filename=tryhtml_checkbox");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	//	driver.findElement(By.name("gender")).click();
		driver.findElements(By.name("vehicle")).get(1).isSelected();
		boolean ischeck = driver.findElements(By.name("vehicle")).get(1).isSelected();
		System.out.println("value before click is  " + ischeck);
		driver.findElements(By.name("vehicle")).get(1).click();
		ischeck = driver.findElements(By.name("vehicle")).get(1).isSelected();
		System.out.println("value after click is  " + ischeck);
		
		Thread.sleep(5000);
		
		if(!ischeck){
			System.out.println("false value");	
		}
		
		else
			driver.findElements(By.name("vehicle")).get(0).click();
		    driver.findElements(By.name("vehicle")).get(1).click();
			
		
	}
	
    public void close1() {
		
        driver.close();
        //close closed the current instance of driver
        driver.quit();
        //closes all the instances
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
        gmaillogin browser1 = new gmaillogin();
        System.out.println("enter one from -  IE/Firefox/chrome/Signup/radiobutton/checkbox");
        String s = in.nextLine();
        browser1.selectbrowser(s);
		//browser1.close1();
		
	}

}

