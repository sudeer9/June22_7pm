package com.BasentTechnologies;
class Abc
{
	Abc()//default constructor
	{
		
		System.out.println("Default ctt");
	}
	
	
	Abc(int i)//parameterized ctt
	{
		//System.out.println("prorgam starts");
		this();
		System.out.println("1 parameterized ctt");
		
	}
	
	Abc(int a, int b)//default constructor
	{
		
		this(1);
		System.out.println("2 parameterized ctt");
	}
}
public class D34_CallToThisStatement 
{

	public static void main(String[] args) 
	{
		Abc a1=new Abc(5,5);
	}

}
