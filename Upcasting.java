package p1;


class A1
{
	void test1()
	{
		System.out.println("test1");
	}
	
	void test2()
	{
		System.out.println("test2");
	}
}


class B1 extends A1
{
	void test3()
	{
		System.out.println("test3");
	}
	
	void test4()
	{
		System.out.println("test4");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 a= new B1();
		a.test1();
	}

}
