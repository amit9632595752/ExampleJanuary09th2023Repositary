package com.sgtesting.abstractclassAssignments;

abstract class Static
{
	static
	{
		System.out.println("It is a static block");
	}
}
class Static1 extends Static
{
	void display()
	{
		System.out.println("It is a Sub class Method");
	}
}
public class StaticBlock
{
	public static void main(String[] args)
	{
		Static1 a=new Static1();
		a.display();
	}
}
