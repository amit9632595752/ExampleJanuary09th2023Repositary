package com.sgtesting.abstractclassAssignments;

abstract class demo17
 {
	static void display()
	{
		System.out.println("Abstract class static method");
	}
	void fact()
	{
		System.out.println("Abstract class Instance Method");
		
	}

}
class demo18 extends demo17
{
	void display1()
	{
		System.out.println("sub class method");
	}
}
class demo19 extends demo18
{
	void fact1()
	{
		System.out.println("sub class two method");
	}
}
public class Program7
{
	public static void main(String [] args)
	{
		demo19 a=new demo19();
		demo17.display();
		a.fact();
		a.display();
		a.fact1();
	}
}