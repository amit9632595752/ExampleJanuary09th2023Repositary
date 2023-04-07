package com.sgtesting.abstractclassAssignments;

abstract class MathsD
{
	MathsD(int x,int y)
	{
		System.out.println("Addition Result : "+(x+y));
	}
	MathsD(double a,double b)
	{
		System.out.println("Division Result : "+(a/b));
	}
	MathsD(String Name,int rollNo)
	{
		System.out.println("Student Name : "+ Name);
		System.out.println("Student Rollno : "+rollNo);
	}
}
class MathsE extends MathsD
{
	MathsE(int a,int b)
	{
		super(a,b);
	}
	MathsE(double x,double y)
	{
		super(x,y);
	}
	MathsE(String sn,int rn)
	{
		super(sn,rn);
	}
	void subtraction(int a,int b)
	{
		System.out.println("Subtraction Result :"+(a-b));
	}
}
class MathsF extends MathsE
{
	MathsF(int a,int b)
	{
		super(a,b);
	}
	MathsF(double x,double y)
	{
		super(x,y);
	}
	MathsF(String sn,int rn)
	{
		super(sn,rn);
	}
	void multiplication(int x, int y)
	{
		System.out.println("Multiplication Result:"+(x*y));
	}
}
public class MultiLevelConstructorOver {

	public static void main(String[] args) {
		MathsF O=new MathsF(90, 50);
		MathsF O1=new MathsF(100.25, 20.25);
		MathsF O2=new MathsF("Amit",10);
		O.multiplication(90, 9);
		O.subtraction(200, 100);
	}
}
