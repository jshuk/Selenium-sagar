package Testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidercls {
	
	@Test(dataProvider="InputData")
	public void test(String s,String t){
		System.out.print("Name= " + s);
		System.out.println("  Password= " + t);
		
		
		if(s.contains("Sarv")){
			Assert.assertTrue(false);
			System.out.println("Failed");
			}
		System.out.println("completed");
		
		}
	@DataProvider(name="InputData")
	public Object[][] Inputs(){
		Object[][] data = {{"jaya","123"},{"Sarv","456"},{"jio","980"}};
		return data;
		
	}

}
