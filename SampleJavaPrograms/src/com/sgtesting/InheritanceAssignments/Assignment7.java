package com.sgtesting.InheritanceAssignments;

 class Demo19
{
	Demo19(String s)
	{
		System.out.println("Constuctor overloading 1");
	}
	Demo19(int a)
	{
		System.out.println("Constuctor overloading 2");
	}

}
class Demo20 extends Demo19
{
	Demo20(String s1)
	{
		super(s1);
	}
	Demo20(int a1)
	{
		super(a1);
	}
	void display()
	{
		System.out.println("It is a sub class 1 :");
	}
}
class Demo21 extends Demo19
{
	Demo21(String s2)
	{
		super(s2);
	}
	Demo21(int a2)
	{
		super(a2);
	}
	static
	{
		System.out.println("It is a sub class 2 static block");
	}
}
class Demo22 extends Demo19
{
	Demo22(String s1)
	{
		super(s1);
	}
	Demo22(int a1)
	{
		super(a1);
	}
	void display1()
	{
		System.out.println("It is a sub class 3 instance block");
	}
}
public class Assignment7
{
	public static void main(String []args)
	{
		Demo22 a=new Demo22("Amit");
		Demo22 a1=new Demo22(10);
		a.display1();
		Demo20 a2=new Demo20("Akul");
		a2.display();
		Demo21 a3=new Demo21("Aadi");
	}
}