package com.BasentTechnologies;
//this is for implicit call of super class constructor
class F
{
	F()
	{
		System.out.println("F ctt");
	}
}

class G extends F
{
	G()
	{
		System.out.println("G ctt");
	}
}

class H extends G
{
	H()
	{
		System.out.println("H ctt");
	}
}

public class D37_SuperStatement1 {
	public static void main(String[] args) {
		
		H h1=new H();
	}

}
