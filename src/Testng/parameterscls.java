package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterscls {
	
	@Parameters({"last-name","first-name"})
	@Test
	public void parm1(String s,String t){
		System.out.println("First Test Case-parm1 is running");
		System.out.println("First name = "+ s + " " + t);
		
	}
	

}
