package com.BasentTechnologies;

 interface J1
{
	 void test1(); // public abstract 
	 int i=10; // static final
	 
}
 interface J2
{
	 void test2(); // public abstract 
	 
	 
}
 interface J3 extends J2,J1
{
	 void test3(); // public abstract 
	 void test4();
	 
}
 
 abstract class DEmo implements J1,J3, J2
 {
	 public void test3()
	 {
		 System.out.println("3");
	 }
	 
	
	 public void test2()
	 {
		 System.out.println("2");
	 }
	 
	 public void test1()
	 {
		 System.out.println("1");
	 }
 }

public class D53_Interface1
{
	public static void main(String[] args)
	{
		DEmo d= new DEmo();
		d.test2();
	}
}