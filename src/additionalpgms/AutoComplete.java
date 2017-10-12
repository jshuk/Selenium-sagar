package additionalpgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	WebDriver driver;
	
	private void init(){
		System.setProperty("webdriver.chrome.driver","/Users/sagarsaibi/Documents/Webonise/QA/Automation/DrfLiveNewsRiver-0/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	private void gSearch(){
		try{
			driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
			Thread.sleep(3000);
			
			
			List<WebElement> optionList = driver.findElements(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li"));
			System.out.println("List of all possibel options are : " + optionList.size());
			
			for(WebElement e:optionList){
				System.out.println(e.findElement(By.className("sbqs_c")).getText());
				if(e.getText().equals("selenium testing")) {
		        	System.out.println("Trying to select selenium testing ");
		            e.click();
		            break;
		        }
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoComplete a = new AutoComplete();
		a.init();
		a.gSearch();
	}

}
