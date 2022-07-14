package p1;

final class A
{
	public void Arithmetic() 
	{
		int i=10;
		int j=20;
		System.out.println(i+j);
	}
}

class B extends A
{
	public void Arithmetic()
	{
		int i=30;
		int j=20;
		System.out.println(i-j);
	}
}

public class ArithmeticOperations {

	public static void main(String[] args) 
	{
		final int i=40;
		//i=50;
		System.out.println(i);
		
		A a= new A();
		a.Arithmetic();
		
		B b= new B();
		b.Arithmetic();

	}

}
