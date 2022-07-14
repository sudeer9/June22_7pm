package com.BasentTechnologies;

public class D24_ParameterizedConstructor 
{

	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		Emp e=new Emp("Emp1",29);
		System.out.println("Name="+e.name);
		System.out.println("Age="+e.age);
		
		System.out.println("==========================================");
		Emp e2=new Emp("emp2",31);
		System.out.println("Name="+e2.name);
		System.out.println("Age="+e2.age);
		
		System.out.println("Program ends");
	}

}

class Emp
{
	String name;//instance variable/global/class variable
	int age;//instance variable/global/class variable
	
	Emp(String n, int a)//parameterized constructor
	{
		name=n;
		age=a;
	}
	
	
}
