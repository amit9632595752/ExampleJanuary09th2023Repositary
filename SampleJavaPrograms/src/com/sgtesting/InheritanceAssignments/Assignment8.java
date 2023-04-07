package com.sgtesting.InheritanceAssignments;

 class Demo23
{
   void show(int a)
   {
	   System.out.println("It is a super class method : "+a);
   }
}
 class Demo24 extends Demo23
 {
	 Demo24(int a)
	 {
		 super.show(a);
	 }
	 void show(int a)
	 {
		 System.out.println("It is a sub class 1 method : "+a);
	 }
 }
class Demo25 extends Demo24
{
	Demo25(int d,int e)
	{
		super(e);
		super.show(d);
	}
	void show(int a)
	{
		System.out.println("It is a sub class 2 method : "+a);
	}
}
public class Assignment8
{
	public static void main(String []args)
	{
		Demo25 a=new Demo25(45,50);
		a.show(10);
	}
}