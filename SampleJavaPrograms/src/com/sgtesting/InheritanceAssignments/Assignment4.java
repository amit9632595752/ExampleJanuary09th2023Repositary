package com.sgtesting.InheritanceAssignments;

 class Demo12
{
	Demo12(String s)
	{
		System.out.println("It is a parameterized constructor");
	}
}
 class Demo13 extends Demo12
 {
	 int a;
	 Demo13(String s1)
	 {
		 super(s1);
	 }
	 void display()
	 {
		 System.out.println("It is a sub class 1");
	 }
 }
 class Demo14 extends Demo13
 {
	 String m;
	 Demo14(String s2)
	 {
		 super(s2);
	 }
	 static
	 {
		 System.out.println("It is a sub class 2");
	 }
 }
 public class Assignment4
 {
	 public static void main(String []args)
	 {
		Demo14 a=new Demo14("Amit");
		a.display();
	 }
 }
 
