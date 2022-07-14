package com.BasentTechnologies;

public class D22_Constructor 
{
	
	//default constructor
	 D22_Constructor()
	{
		System.out.println("default constt");
	}
	 
	 void test()
	 {
		 System.out.println("test");
	 }
		 
	
public static void main(String[] args)
	 {
		D22_Constructor d=new D22_Constructor();
		Abc1 b= new Abc1();
	 }

}

class Abc1
{
	Abc1()
	{
		System.out.println("abc");
	}
}

