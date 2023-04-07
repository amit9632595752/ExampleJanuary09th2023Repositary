package com.sgtesting.InheritanceAssignments;

 class Demo4
 {
	 Demo4()
	 {
		 System.out.println("It is a no args constructor");
	 }
 }
class Demo5 extends Demo4
{
	Demo5(String s)
	{
		System.out.println("It is a parameterzed constructor");
	}
}
class Demo6 extends Demo4
{
	void fact()
	{
	System.out.println("It is a method which do not return any value");
	}
}

class Demo7 extends Demo4
{
	int display1(int a)
	{
		a+=5;
		System.out.println("It is a return method");
		return a;
	}
}
public class  HierarichalInheritance
{
	public static void main(String []args)
	{ 
		Demo7 a=new Demo7();
		a.display1(10);
		
		Demo6 a1=new Demo6();
		a1.fact();
		
		Demo5 a2=new Demo5("Amit");
	}
}