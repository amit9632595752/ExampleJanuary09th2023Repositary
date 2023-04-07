package com.sgtesting.Polymorphism;

abstract class Geometric1 
{
  abstract void substraction();
}
class demo4 extends Geometric1
{
	void substraction()
	{
		int a,b;
		a=90;
		b=20;
		System.out.println("substraction of two numbers :"+(a-b));
	}
}
class demo5 extends Geometric1
{
	void substraction()
	{
		int a,b,c;
		a=210;
		b=20;
		c=30;
		System.out.println("substraction of three numbers :"+(a-b-c));
	}
}
class demo6 extends Geometric1
{
	void substraction()
	{
		int a,b,c,d;
		a=190;
		b=20;
		c=30;
		d=40;
		System.out.println("substraction of four numbers :"+(a-b-c-d));
	}
}

public class Program2
{
	public static void main(String[] args)
	{
		Geometric1 a=null;
		demo4 b=new demo4();
		demo5 c=new demo5();
		demo6 d=new demo6();
		
		a=b;
		a.substraction();
		
		a=c;
		a.substraction();
		
		a=d;
		a.substraction();
	}

}


