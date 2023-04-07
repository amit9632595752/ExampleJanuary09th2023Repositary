package com.sgtesting.InheritanceAssignments;

 class Demo8
{
	 {
		 System.out.println("It is a super class");
	 }

}
 class Demo9 extends Demo8
 {
	 {
		System.out.println("It is a sub class"); 
	 }
 }
 class Demo10 extends Demo9
 {
	 {
		System.out.println("It is a sub class 2"); 
	 }
 }
class Demo11 extends Demo8
{
	{
		System.out.println("It is a sub class 3");
	}
}
public class HybridInheritance
{
	public static void main(String []args)
	{
		Demo10 o=new Demo10();
		Demo11 o1=new Demo11();
	}
}