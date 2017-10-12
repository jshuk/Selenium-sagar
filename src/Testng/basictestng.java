package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basictestng {
	
	@Test (groups = {"G1"})
	public void test1(){
		
		System.out.println("This is test1 -group1");
		
	}
	
     @Test (groups = {"G2"},enabled=false)
	public void test2(){
		
		System.out.println("This is test2 - groups2");
		
		
	}
     
	@Test (groups = {"G1","G2"})
	public void test3(){
		
		System.out.println("This is test3- both group1,2");
		
	}
	@BeforeMethod (alwaysRun=true)
	public void beforemethod(){
		System.out.println("Executing before method");
	}
	@AfterMethod (alwaysRun=true)
	public void aftermethod(){
		System.out.println("Executing after method");
	}
	@BeforeSuite (alwaysRun=true)
	public void beforesuite(){
		System.out.println("Before Suite");
	}
	@AfterSuite (alwaysRun=true)
	public void aftersuite(){
		System.out.println("after Suite");
	}
	@BeforeTest (alwaysRun=true)
	public void beforetest(){
		System.out.println("Before Test run");
	}
	@AfterTest (alwaysRun=true)
	public void aftertest(){
		System.out.println("After Test run");
	}
	@BeforeClass (alwaysRun=true)
	public void beforeclass(){
		System.out.println("Before class");
	}
	@AfterClass (alwaysRun=true)
	public void afterclass(){
		System.out.println("After class");
	}
}
