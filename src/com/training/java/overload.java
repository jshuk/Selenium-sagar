package com.training.java;

public class overload {
	
	public int jaya(){
		int i = 10;
		System.out.println("First");
		return i;
		
		
	}
	
	public int jaya(int i){
		
	
		int j =20;
		
		System.out.println("Second");
		return j;
		
		
	}
	
	public int jaya(int i,String j){
		int k =20;
		System.out.println("Third");
		return k;
		
		
	}
	

	public static void main(String[] args) {
		
		overload ol = new overload();
        ol.jaya();
        ol.jaya(7);
        ol.jaya(2,"Jaya");



		
			
		
	}

}


/* Type promotion learn on own
 * 
 */

