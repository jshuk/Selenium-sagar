package com.training.java;

public class exceptionhandling {
	
	public void example1(){
		int a=1;
		int b=0;
		 int array[] = {1,2,3,4,5};
		 
		try{
			for(int i=0;i<array.length;i++)
				 System.out.println(array[i]);
			
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
		catch(ArrayIndexOutOfBoundsException e){
	    	System.out.println("This is arrayindex exception");
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
	}

	public static void main(String[] args) {
		
		exceptionhandling exp = new exceptionhandling();
		System.out.println("PRINT EXCEPTION1");
	    exp.example1();
	    System.out.println("PRINT EXCEPTION2");
	}

}



/*
 * nested try and catch blocks
 * 
 * 
 * arithmenticexception not allowed after exception
 * 
 * 
 */

