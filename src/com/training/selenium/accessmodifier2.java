package com.training.selenium;

import com.training.java.acessmodifier1;

public class accessmodifier2 extends acessmodifier1 {

	public static void main(String[] args) {
		accessmodifier2 am1 = new accessmodifier2();
		System.out.println(am1.i);
	//	System.out.println(am1.j);
		System.out.println(am1.k);
	//	System.out.println(am1.l);
		
	}

}


//protected can be accessed using inheritance and create object in child class
//but default not accessible