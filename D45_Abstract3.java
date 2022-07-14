package com.BasentTechnologies;
abstract class Abs
{
	
abstract void test2();	

abstract void test20();

void test6()
{
	System.out.println("test6");
}

}
 class Abs1 extends Abs//compilation error bcoz we extended Abs1 class to Abs class but
// we did not implement test2() method. Either we should implement test2() method
//in sub class or we should declare sub class as abstract
{

	
	void test2() {
		System.out.println("test2");
		
	}

	
	void test20() {
		System.out.println("test20");
	}

}
 
 
public class D45_Abstract3 {
	public static void main(String[] args) 
	{
		Abs1 ab=new Abs1();
		ab.test2();
		ab.test6();
		ab.test20();
		
	}
}
