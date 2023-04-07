package com.sgtesting.InheritanceAssignments;

 class Demo15
{
	 Demo15(String s)
	 {
		 System.out.println("It is a parameterized constructor");
	 }
}
 class Demo16 extends Demo15
 {
	 Demo16(String s1)
	 {
		 super(s1);
	 }
	 void display()
	 {
		 System.out.println("It is a sub class 1");
	 }
 }
 class Demo17 extends Demo16
 {
	 Demo17(String s2)
	 {
		 super(s2);
	 }
	 int display(int d)
	 {
		 d+=5;
		 System.out.println("It is a sub class 2");
		 return d;
	 }
 }
class Demo18 extends Demo15
{
	Demo18(String s3)
	{
		super(s3);
	}
	static void show()
	{
		System.out.println("It is a last sub class");
	}
}
public class Assignment6
{
	public static void main(String[] args)
	{
		Demo18 a=new Demo18("Aadi");
		a.show();
		
		Demo17 o=new Demo17("Gundus");
		o.display();
	}
}