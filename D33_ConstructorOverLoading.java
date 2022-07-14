package com.BasentTechnologies;

	class A
	{
		A()
		
		{
			System.out.println("default constructor");
		}
		
		A(int i)
		{
			this();
			System.out.println("Constructor with 1 arg");
			
		}
		
		A(int i, int j)
		{
			this(3);
			
			System.out.println("Constructor with 2 args");
		}
	}

	public class D33_ConstructorOverLoading 
	{
		public static void main(String[] args) 
		{
			
			
			A a2 = new A(5,7);
			
			
			//this this()

		}

	}


//this this()
//super super()