package com.sgtesting.abstractclassAssignments;

abstract class Maths3
{
	abstract void addition(int x,int y);
	abstract void subtraction(int a,int b);
	abstract void multiplication(int x, int y);
}
class Maths4 extends Maths3
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result : "+(x+y));
	}
	void subtraction(int a,int b)
	{
		System.out.println("Subtraction Result :"+(a-b));
	}
	void multiplication(int x, int y)
	{
		System.out.println("Multiplication Result:"+(x*y));
	}
}
class Maths5 extends Maths3
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result : "+(x+y));
	}
	void subtraction(int a,int b)
	{
		System.out.println("Subtraction Result :"+(a-b));
	}
	void multiplication(int x, int y)
	{
		System.out.println("Multiplication Result:"+(x*y));
	}
}
public class HerarichalAbstractMethods
{

	public static void main(String[] args)
	{
		Maths4 O=new Maths4();
		O.addition(90, 50);
		O.subtraction(100, 50);
		O.multiplication(10, 9);
		Maths5 b=new Maths5();
		b.addition(60, 50);
		b.subtraction(90, 80);
		b.multiplication(60, 8);
	}
}