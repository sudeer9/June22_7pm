package com.BasentTechnologies;

public class D15_LocalGlobalVariables 
{
//global/class/instance variables
	static int i=20;
	static String s="Java";
	//non static variable
	int j=30;
	public static void main(String[] args) 
	{
		//Local Variables
		int i=10;
		String a="Selenium";
		
		//Below statement prints value of local variable i bcoz methods gives preference to local variables
		System.out.println(i);
		
		//Below statement prints value of global variable i
		System.out.println(D15_LocalGlobalVariables.i);
		
		//creating an instance of a class to access non static member in static method
		D15_LocalGlobalVariables d=new D15_LocalGlobalVariables();
		//Below statement prints value of non static global variable j
		System.out.println(d.j);
	
		
		
	}

}
