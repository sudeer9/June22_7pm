package com.BasentTechnologies;

 class Animal
{
	   void move()
	{
		System.out.println("All animals will move from one place to another place");
		
	}
	   
	   void test()
	   {
		   
	   }
}

class Dog extends Animal
	{
		 void move()
		{
			//super.move();//super is used to access super class members
			int frontLegs=2;
			int backLegs=2;
			int totalLegs=frontLegs+backLegs;
			System.out.println("Total legs are "+totalLegs);
			System.out.println("Dog has 4 Legs and it walks");
			
			System.out.println("================================");
		}
	}

	class Snake extends Animal
	{
		 void move()
		{
			String legs="Snake has no legs";
			System.out.println(legs);
			System.out.println("Snake has no legs and it crawls");
		}
	}
	public class D41_MethodOverriding {
		public static void main(String[] args) {
			
			Dog d=new Dog();
			d.move();
			Snake s=new Snake();
			s.move();
		}

		
	}