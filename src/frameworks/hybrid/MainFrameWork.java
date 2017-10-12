package frameworks.hybrid;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class MainFrameWork {
	WebDriver mydriver;
	public void executeSteps(WebDriver driver,String filePath, int sheetNum, String[] testData){
		mydriver = driver;
		System.out.println("File to be read is : " + filePath);
		
		try {
			
			File dataFile = new File(filePath);
			FileInputStream f = new FileInputStream(dataFile);
			
			XSSFWorkbook wb = new XSSFWorkbook(f);
			XSSFSheet sheet = wb.getSheetAt(sheetNum);
			int rows = sheet.getLastRowNum();
			System.out.println(rows);
		
			for(int i=0; i< rows; i++){
				String action = sheet.getRow(i).getCell(0).getStringCellValue();
				String object = sheet.getRow(i).getCell(1).getStringCellValue();
				//String testData = sheet.getRow(i).getCell(2).getStringCellValue();
				
				System.out.println("Action is : "+ action);
				System.out.println("Object is : "+ object);
				//System.out.println("TestData is : "+ testData);
				executeAction(action,object,testData[i]);
			}
		}catch(Exception e){
			
		}
	}
	
	public void executeAction(String action, String object, String testData){
		ObjectFinder o = new ObjectFinder();
		try{
			switch(action){
				case "openBrowser" :
						System.out.println("Executing openBrowser action");
						mydriver.get(testData);
						Thread.sleep(2000);
						break;
				case "click": 
						System.out.println("Executing click action");
						mydriver.findElement(o.getObject(object)).click();
						Thread.sleep(2000);
						break;
				case "sendKeys": 
						System.out.println("Executing sendkeys action");
						mydriver.findElement(o.getObject(object)).sendKeys(testData);
						Thread.sleep(2000);
						break;
				case "clearText": 
						mydriver.findElement(o.getObject(object)).clear();
						Thread.sleep(2000);
						break;
				default: System.out.println("Invalid action");
			}
		}catch(Exception e){
			
		}
	}
}
