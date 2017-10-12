package com.training.java;

public class oopsconcepts {
	
	int A = 0;
	int B = 1;
	
	public oopsconcepts(){
		A = 100;
		B = 200;
		
		System.out.println("1> Default Constructor");
		
	//	System.out.println("Values changed");
		
	}
	
	
	
	
public oopsconcepts(int j){
		System.out.println();
		System.out.println("2> Parametrized Constructor ---> j =   " + j);
		
	}

public oopsconcepts(int i,int j){
	System.out.println();
	A=76;
	System.out.println("3> Parametrized Constructor ---> i =   " + i + "  , j = " + j);
	
}

public oopsconcepts(oopsconcepts c){
	System.out.println("4>  copy constuctor");
	A = c.A;
    B = c.B;
	
}

	public static void main(String[] args) {
      
		
 //    oopsconcepts oc = new oopsconcepts();
    
 //    System.out.println("Value of A is "+ oc.A);
 //    System.out.println("Value of B is "+ oc.B);
 //    oopsconcepts oc1 = new oopsconcepts(799);
     oopsconcepts oc2 = new oopsconcepts(799,899);
     
     System.out.println("Value of A is "+ oc2.A);
    System.out.println("Value of B is "+ oc2.B);
     
     
    oopsconcepts oc3 = new oopsconcepts(oc2);
     
     System.out.println("Value of A is "+ oc3.A);
    System.out.println("Value of B is "+ oc3.B);
     
     
     
     
     
     
     

	}

}
