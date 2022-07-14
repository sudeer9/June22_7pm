package com.BasentTechnologies;

class Shape
{
	int d1;
	int d2;
	Shape(int a, int b)
	{
		d1=a;
		d2=b;
	}
}

class Rectangle extends Shape
{
	Rectangle(int l, int b)
	{
		super(l,b);
	}
	
	int getArea()
	{
		return d1*d2;
		
	}
}

class Triangle extends Shape
{
	Triangle(int b, int h)
	{
		super(b,h);
	}
	
	int getArea()
	{
		return(d1*d2)/2;
	}
}

public class D38_SuperStatement1 {

	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(10, 20);
		System.out.println(r1.getArea());
		
		
	}

}
