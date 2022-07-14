package com.BasentTechnologies;

public class D14_NonStaticMethod {
	//Execution starts from main method
	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		//Creating an object of class to call "add" method
		D14_NonStaticMethod m=new D14_NonStaticMethod();
	   int Result = m.add(10, 20);
		System.out.println(Result);
		System.out.println("Program ends");
	}
	
	//To add the numbers
	 public int add(int n1, int n2)
	 {
		 int sum=n1+n2;
		 return sum;
	 }

}
