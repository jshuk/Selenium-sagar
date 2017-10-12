package com.training.java;

public class acessmodifier1 {
	
	public int i=0;
    private int j=1;
	protected int k=2;
	int l=3;
	

	public static void main(String[] args) {
		acessmodifier1 am11 = new acessmodifier1();
		
	 System.out.println(am11.i);
	 System.out.println(am11.j);
	 System.out.println(am11.k);
	 System.out.println(am11.l);
	
	}

}


//private - only within class
//protected - with in package
//default - same as protected

