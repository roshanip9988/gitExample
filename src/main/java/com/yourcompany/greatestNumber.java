package com.yourcompany;

import java.util.Scanner;

public class greatestNumber {
	
	public static void main(String[] args)
	{
		Scanner value = new Scanner(System.in);
		
		System.out.println("Enter the value of a = ");
		int a = value.nextInt();
		
		System.out.println("Enter the value of b = ");
		int b=value.nextInt();
		
		System.out.println("Enter the value of c= ");
		int c=value.nextInt();
		
		 if(a > b && a > c)
		{
			System.out.println("The greatest value is = " + a);
			
		} if (b > a && b > c)
		{
			System.out.println("The greatest value is = " + b);
		}
		if(c > a && c > b)
		{
			System.out.println("The greatest value is =" + c);
		}
		else
		{
			System.out.println("Error in your code");
		} 
		
	}

}
