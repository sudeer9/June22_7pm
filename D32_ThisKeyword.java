package com.BasentTechnologies;

class Tree1
{
	int height;//here height is instance variable
	//constructor
	Tree1(int height)//here hight is a local variable
	{
		this.height=height;
	}
}

public class D32_ThisKeyword 
{
	public static void main(String[] args) 
	{
		
		System.out.println("program starts");
		Tree1 t1= new Tree1(5);//Default values for byte,short,int and long is 0,, for double and float=0.0 and for char=empty and for boolean=false
		System.out.println(t1.height);
		System.out.println("program ends");
		
	}

}
