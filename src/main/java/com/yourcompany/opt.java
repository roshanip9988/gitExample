package com.yourcompany;

import java.util.Scanner;

public class opt {
	public static void main(String[] args)
	{
		/*
		Static Variable Calculation
		int a=10;
		int b=10;
		int sum=a+b;
		System.out.println(sum); */
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the value of a = ");
		int a=myObj.nextInt();
		
		System.out.println("Enter the value of b = ");
		int b=myObj.nextInt();
		
		int sum=a+b;
		System.out.println("Sum of a & b is= " + sum);
		
		
		
	}

}
