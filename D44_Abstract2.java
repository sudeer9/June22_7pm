package com.BasentTechnologies;
   abstract class Abcd
{
	 public void test1()
	{
		System.out.println("abc");
	} 
	abstract void test2();
}
   
   class Def extends Abcd
   {
	   void test2()
	   {
		   System.out.println("test2");
	   }
   }
   
   
public class D44_Abstract2 {
	public static void main(String[] args) {
		Def d= new Def();
		d.test1();
		d.test2();
		
	}
}
