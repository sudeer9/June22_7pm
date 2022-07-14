package p1;

 abstract class C
{
	void test1()
	{
		System.out.println("test1");
	}
	
	abstract void test2();
	abstract void test3();
}
 
abstract class D extends C
 {
	 void test2()
	 {
		 System.out.println("test2");
	 }
	 
	
 }

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D d= new D();
		d.test1();
		d.test2();

	}

}
