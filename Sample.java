package p1;

public class Sample 
{
	 int k=3;
	public static void main(String [] args)
	{
		System.out.println("main");
		Java7pm ref=new Java7pm();
		ref.test2();
		
		Sample ref1=new Sample();
		ref1.test3();
		System.out.println(ref1.k);
		
	}
	
	public void test1()
	{
		System.out.println("test1");
	}
	
	public static void test3()
	{
		System.out.println("test1");
	}
}

 class Java7pm
{
	public void test2()
	{
		System.out.println("test2");
	}
}
 
 //Assignment1:
 //1. Write the syntax for creating a class,method and variable with example
 //write an example for accessing/invoking static members in a main method
 ////write an example for accessing/invoking Non-static members in a main method
 //write an example for local and global variables
