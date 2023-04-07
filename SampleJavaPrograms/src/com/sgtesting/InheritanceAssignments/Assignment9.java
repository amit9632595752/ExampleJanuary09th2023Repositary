package com.sgtesting.InheritanceAssignments;

 class Demo26
 {
	 int a;
	 void fact(int a)
	 {
		 this.a=a;
		 System.out.println("It is a super class :"+a);
	 }
 }
 class Demo27 extends Demo26
 {
	 int a;
	 void show(int f,int m)
	 {
		 super.fact(m);
		 a=f;
		 System.out.println("It is a sub class 1 :"+a);
	 }
 }
 class Demo28 extends Demo27
 {
	 int a;
	 Demo28(int c,int d,int s)
	 {
		 super.show(d, s);
		 a=c;
	 }
	 void display() 
	 {
		 System.out.println("It is a sub class 2 :"+a);
	 }
 }
public class Assignment9
{
	public static void main(String []args)
	{
		Demo28 o=new Demo28(70,80,90);
		o.display();
	}
}