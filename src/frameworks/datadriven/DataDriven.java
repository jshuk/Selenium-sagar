package frameworks.datadriven;

import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@Test(dataProvider="getData")
	public void loginTest(String uname, String passwd){
		System.out.println("Test case execution started");
		System.out.println("Username is : " + uname);
		System.out.println("Password is : " + passwd);
		System.out.println("Test case execution completed");
	}
	
	@DataProvider(name="getData")
	public Object[][] getData() throws FileNotFoundException{
		Object [][] data = null;
		
		String dataFile = "C:\\Users\\IBM_ADMIN\\Documents\\selenium_cls\\New folder\\NOTES\\TestData\\loginDemo.xlsx";
		
		FileReader f = new FileReader();
		data = f.fetchData(dataFile);
		return data;
	}
}
