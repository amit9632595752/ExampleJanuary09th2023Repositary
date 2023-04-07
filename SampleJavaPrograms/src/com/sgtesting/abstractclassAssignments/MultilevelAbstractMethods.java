package com.sgtesting.abstractclassAssignments;
abstract class Maths
{
	abstract void addition(int x,int y);
	abstract void subtraction(int a,int b);
	abstract void division(int a,int b);
}
abstract class Maths1 extends Maths
{
	void addition(int x,int y)
	{
		int c=x+y;
		System.out.println("Addition Result : "+c);
	}
	void subtraction(int a,int b)
	{
		int d=a-b;
		System.out.println("Subtraction Result :"+d);
	}
}
class Maths2 extends Maths1
{
	void division(int a,int b)
	{
		System.out.println("Division Result :"+(a/b));
	}
	void multiplication(int x, int y)
	{
		System.out.println("Multiplication Result:"+(x*y));
	}
}
public class MultilevelAbstractMethods {
	public static void main(String[] args) {
		Maths2 O=new Maths2();
		O.addition(20, 40);
		O.subtraction(50,60);
		O.multiplication(60, 7);
		O.division(80, 7);
	}
}
