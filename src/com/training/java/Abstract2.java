package com.training.java;

public class Abstract2 extends Abstraction {

	public static void main(String[] args) {
		Abstract2 ab = new Abstract2();
		ab.method1();
        System.out.println("Instance variable of abstract class = "+ ab.i);
        ab.abs1();
       
	}

	@Override
	public void abs1() {
		int j = 9;
		System.out.println(j);
		
		
	}

}
