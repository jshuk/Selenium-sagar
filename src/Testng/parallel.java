package Testng;

import org.testng.annotations.Test;

public class parallel {
	@Test
	public void test1() throws InterruptedException{
		System.out.println("Test1- started");
		Thread.sleep(5000);
		System.out.println("Test1- completed");
	}
	@Test
	public void test2() throws InterruptedException{
		System.out.println("Test2- started");
		Thread.sleep(7000);
		System.out.println("Test2- completed");
	}
	@Test
	public void test3() throws InterruptedException{
		System.out.println("Test3- started");
		Thread.sleep(6000);
		System.out.println("Test3- completed");
	}
	@Test
	public void test4() throws InterruptedException{
		System.out.println("Test4- started");
		Thread.sleep(3000);
		System.out.println("Test4- completed");
	}
	
	@Test
	public void test5() throws InterruptedException{
		System.out.println("Test5- started");
		Thread.sleep(2000);
		System.out.println("Test5- completed");
	}
	

}
