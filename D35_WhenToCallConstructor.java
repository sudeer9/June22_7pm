package com.BasentTechnologies;
class Box
{
	int height;
	int width;
	int length;
	String color;
	
	Box()
	{
		System.out.println("default ctt");
	}
	
	Box(int h, int w, int l)
	{
		height=h;
		width=w;
		length=l;
	}
	
	Box(int h, int w, int l, String c)
	{
		/*height=h;
		width=w;
		length=l;*/
		//To reduce the above 3 lines of repeated code we call the above constructor using this() statement
		this(h,w,l);//this will call the above constructor
		color = c;	
	}
}

public class D35_WhenToCallConstructor 
{
	public static void main(String[] args) 
	{
		
		Box b1=new Box(10,5,8,"blue");
		System.out.println(b1.height);
		System.out.println(b1.width);
		System.out.println(b1.length);
		System.out.println(b1.color);
	}

}
