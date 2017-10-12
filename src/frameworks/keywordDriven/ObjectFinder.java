package frameworks.keywordDriven;

import org.openqa.selenium.By;

public class ObjectFinder {
	public By getObject(String object){
		By myobject=null;
		String[] objectInfo = object.split("=");
		
		System.out.println("object : " + object);
		System.out.println("objectInfo[0] : " + objectInfo[0]);
		System.out.println("objectInfo[1] : " + objectInfo[1]);
		
		switch(objectInfo[0]){
			case "className": 
					System.out.println("Searching object by className");
					myobject = By.className(objectInfo[1]);
					break;
			case "id": 
					System.out.println("Searching object by id");
					myobject = By.id(objectInfo[1]);
					break;
			case "cssSelector": 
					System.out.println("Searching object by cssSelector");
					myobject = By.cssSelector(objectInfo[1]);
					break;
			case "xpath": 
					System.out.println("Searching object by xpath");
					myobject = By.xpath(objectInfo[1]);
					break;
			
		}
		
		return myobject;
	}
}
