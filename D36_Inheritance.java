package com.BasentTechnologies;

  class A1
{
	  void test1()
	{
		System.out.println("test 1 in class A1");
	}
}

  class A2 extends A1
  {
	  void test2()
	  {
		  System.out.println("test 2 in class A2");
	  }
  }
 
public class D36_Inheritance 
{
	public static void main(String[] args)
	{
		A2  a2= new A2();
		a2.test1();
		a2.test2();
		
	}

}

//this this()
//super super()
