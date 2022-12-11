package com.yourcompany;

class Parent
{
	String s;
	int num;
	
	void parent()
	{
		System.out.println("Deafault constructor 1");
	}
	void parent(String s1,int num2)
	{
		System.out.println("Constructor 2 "+ s1 + num2);
	}
}
 
class child extends Parent
{
	int numb3;
	child()
	{
		System.out.println("Child class 1");
	}
	
	child(int a, int b)
	{
		//super();
		//System.out.println(super);
		
	}
}

public class polymor {
	
	    public static void main(String[] args)
	    {
		//child c = new child(2,3);
		//System.out.println(c);
	    }
		
}
