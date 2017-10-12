package com.training.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionhandling {
	
	public void example1() throws FileNotFoundException{
		int a=1;
		int b=5;
		 int array[] = {1,2,3,4,5};
		 
		 
			FileInputStream fi= new FileInputStream("");
		 
		
		 
		try{
			
			try{
			for(int i=0;i<=array.length;i++)
				 System.out.println(array[i]);
			}
			finally {
				System.out.println("This is arrayfinally exception");
		    
			}
			
			
			int k=a/b;
		}
		
	    catch(ArithmeticException e){
	    	System.out.println("This is arithmetic exception");
	    	//e.printStackTrace();
	        e.getMessage();
	    	e.toString();
	    	System.out.println("Message is " + e.getMessage());
	    	System.out.println("Message is " + e.toString());
	    }
		
	    
		catch(Exception e){
	    	System.out.println("This is arrayindex exception");
	    	//e.printStackTrace();
	        e.getMessage();
	    	e.toString();
	    	System.out.println("Message is " + e.getMessage());
	    	System.out.println("Message is " + e.toString());
		}
		
		finally{
			System.out.println("I am in finally block");
			int o =0;
			
			System.out.println(o);
			o++;
			/*
			 * do particular things which may be executed irrespective of exceptions
			 * 
			 */
		}
		}    
	
	
	public void example2(){
		
		System.out.println("Before throw");
		try {
			throw new customexception();
		} catch (customexception e) {
		//	e.printStackTrace();
			e.getMessage();
	    	e.toString();
	    	System.out.println("Message is " + e.getMessage());
	    	System.out.println("Message is " + e.toString());
		}
		System.out.println("After throw");
		
		
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		
		exceptionhandling exp = new exceptionhandling();
		//System.out.println("PRINT EXCEPTION1");
	    exp.example2();
	  //  System.out.println("PRINT EXCEPTION2");
	    
	}

}



/*
 * nested try and catch blocks
 * 
 * 
 * arithmenticexception not allowed after exception
 * finally will get executed at the end
 * it will be executed even if we dont get eception
 * 
 * practice all the topics with diffeent data types and leran exception handling in a better way
 * 
 */

