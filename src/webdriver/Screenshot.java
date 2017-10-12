package webdriver;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	WebDriver driver = null;
	
	public void selectbrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void openpage(){
		driver.get("https://www.facebook.com/");
	}
	
	public void takeshot(int n){
		File f =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(f,new File("C:\\Users\\IBM_ADMIN\\Downloads\\jaya_"+n+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Screenshot s = new Screenshot();
		s.selectbrowser();
		s.openpage();
		Random rand = new Random();
		int  n = rand.nextInt(50) + 1;
	//	Date date = new Date();
	//	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
	//	String newstring = new SimpleDateFormat("yyyy-MM-dd").format(date);
	//	Timestamp newstring =new Timestamp(date.getTime());
		
		s.takeshot(n);
		

	}

}
