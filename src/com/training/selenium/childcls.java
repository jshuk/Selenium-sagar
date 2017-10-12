package com.training.selenium;

public class childcls extends Parentcls {
	
	public String getmsg(String s){
		return "YOO"+ s;}
	public String getmsg1(String st){
		return "new one" + st;
	}
	

	public static void main(String[] args) {
	childcls obj = new childcls();
	Parentcls obj1 = new Parentcls();
	System.out.println("This is parent messge  --->   " + obj1.getmsg(" Jayas"));
	System.out.println("This is child message  --->   " + obj.getmsg("  Jayas...."));

	}

}
