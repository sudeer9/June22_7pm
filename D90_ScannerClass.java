package com.BasentTechnologies;

import java.util.Scanner;

public class D90_ScannerClass {
	//Example to get input from console
	//Example of the Java Scanner class which reads the int, string and double value as an input
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			int i=10;
			int b=20;
			
			System.out.println("Sum of i and b is " +(i+b));
			
			sc.next();
			
			System.out.println("java");
			sc.nextInt();
			
			System.out.println("Selenium");
			sc.nextDouble();
			
			System.out.println("Terminate");
			
		
		}

	}