package Testng;

import org.testng.annotations.Test;

public class parallel2 {
	@Test
	public void test1() throws InterruptedException{
		System.out.println("Test1- started---cls2");
		Thread.sleep(16000);
		System.out.println("Test1- completed---cls2");
	}
	@Test
	public void test2() throws InterruptedException{
		System.out.println("Test2- started---cls2");
		Thread.sleep(7000);
		System.out.println("Test2- completed----cls2");
	}
	@Test
	public void test3() throws InterruptedException{
		System.out.println("Test3- started---cls2");
		Thread.sleep(6000);
		System.out.println("Test3- completed---cls2");
	}
	@Test
	public void test4() throws InterruptedException{
		System.out.println("Test4- started---cls2");
		Thread.sleep(3000);
		System.out.println("Test4- completed---cls2");
	}
	
	@Test
	public void test5() throws InterruptedException{
		System.out.println("Test5- started---cls2");
		Thread.sleep(2000);
		System.out.println("Test5- completed---cls2");
	}
	

}
