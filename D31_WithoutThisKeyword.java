package com.BasentTechnologies;
class Tree
{
	int height;//here height is instance variable
	//constructor
	Tree(int height)//here hight is a local variable
	{
		this.height=height; 
	}
}

public class D31_WithoutThisKeyword 
{
	public static void main(String[] args) 
	{
		
		System.out.println("program starts");
		Tree t= new Tree(5);//Default values for byte,short,int and long is 0, 
		//for double and float=0.0 and for char=empty and for boolean=false
		//for String=null
		System.out.println(t.height);
		System.out.println("program ends");
		
	}

}

//this super  this() super()
