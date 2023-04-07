package com.sgtesting.abstractclassAssignments;

abstract class demo
{
	demo(int a)
	{
		System.out.println("It is a Abstract Class: "+a);
	}
}
class demo1 extends demo
{
	demo1(int b)
	{
		super(b);
	}
	void view()
	{
		System.out.println("It is A subClass Constructor: ");
	}
}
class demo2 extends demo1
{
	demo2(int c)
	{
		super(c);
	}
	void name()
	{
		System.out.println("It Is A Extension demo1");
	}
}
public class MultiLevelParametrized
{
	public static void main(String[] args)
	{
		demo2 O=new demo2(10);
		O.view();
		O.name();
	}
}
