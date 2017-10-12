package webdriver;

import org.openqa.selenium.By;

//consult gmaillogin pgm

public class objectrepocls {
	
 	public static String email = "id=identifierId";
 	public static String next1 = "id=identifierNext";
 	
	public static By getObject(String obj){

		By myByObj=null;

		String str[] =obj.split("=");
		switch(str[0]){


		case "id" :
		  myByObj = By.id(str[1]);
		break;

		case "name":
		break;
		
		
		}


		return myByObj;
		}

	
}
