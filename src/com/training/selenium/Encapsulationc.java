package com.training.selenium;

public class Encapsulationc {
	private String name = "Jaya Shukla";
	private int empid = 4;
	
	public String getName(){
		return name;
	}
	public int getId(){
		return empid*100;
	}
	
	public  void setName(String s){
		name=s;
		
	}
	
	public static void main(String[] args) {
		

	}

}
