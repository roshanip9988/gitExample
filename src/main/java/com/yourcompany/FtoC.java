package com.yourcompany;

import java.util.Scanner;

public class FtoC {
	
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number in Fahrenheit = ");
		double f=sc.nextDouble();
		
		double c= ((5* (f-32.0)) /9.0);
		System.out.println(f + "degree Fahrenheit is equal to" + c + "in Celsius");
				
	}

}
