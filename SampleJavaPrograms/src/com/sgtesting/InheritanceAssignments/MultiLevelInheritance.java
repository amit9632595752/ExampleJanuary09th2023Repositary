package com.sgtesting.InheritanceAssignments;

 class Demo1
 {
	 void display()
	 {
		 System.out.println("It is a super class");
	 }
 }
 class Demo2 extends Demo1
 {
	 void display1()
	 {
		 System.out.println("It is a sub class");
	 }
 }
 class Demo3 extends Demo2
 {
	void display2()
	{
		System.out.println("It is a sub class two");
	}
 }
public class  MultiLevelInheritance
{
	public static void main(String []args)
	{
		Demo3 a=new Demo3();
		a.display();
		a.display1();
		a.display2();
	}
}