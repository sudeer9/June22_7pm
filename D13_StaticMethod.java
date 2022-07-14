package com.BasentTechnologies;

public class D13_StaticMethod {

	//Execution starts from main method
	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		//calling the static "add" method with the required inputs
//		//If it is in different class, u can acess static method by classname.method name 
	int result1 = D13_StaticMethod.add(9, 9);
	System.out.println("The result is " + result1);
		//If it is in same class, u can acess static method by method name itself
		int result = add(10, 100);
		System.out.println("The result is " + result);
		System.out.println("Program ends");
	}
	
	//To add the numbers
	 public static int add(int n1, int n2)
	 {
		/* int sum=n1+n2;
		return sum;*/
		 
		 return n1+n2;
		 //statements present after return statements are known as unreachable statements
		 //System.out.println("java");
	 }

}
