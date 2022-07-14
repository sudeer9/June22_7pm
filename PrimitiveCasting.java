package p1;

public class PrimitiveCasting {
	
	public static void main(String[] args) 
	{
		//type1 RefVar=(type1)valueOf Type2
				
		int a=(int)12.3;//narrowing i.e converting double type to int type
		System.out.println(a);
		double d=(double)12;//widening
		System.out.println(d);
		//java implicitly does widening
		double d1=10;//auto widening
		System.out.println(d1);
		double d2=(10);//auto widening
		System.out.println(d2);
		float dw=(float)10.1;
		System.out.println(dw);
		//int a2=12.3;//compilation error bcoz auto narrowing is explicit
		//int a3=(12.3)//compilation error bcoz auto narrowing is explicit
	
	}

}
