package com.training.java;

public class Interfacecls implements Interface1,Interface3{

	public static void main(String[] args) {
		
    Interfacecls in = new Interfacecls();
    in.abstarct2();
    System.out.println(Interface3.l);
    in.method1();
    System.out.println(Interface2.k);
   
	}

	@Override
	public void abstarct2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}
