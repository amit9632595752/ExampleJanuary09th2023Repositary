package com.sgtesting.Polymorphism;

	abstract class Geometric
	{
		abstract void addition();
	}
	class demo1 extends Geometric
	{
		void addition()
		{
			int a,b;
			a=10;
			b=20;
			System.out.println("Addition of two numbers :"+(a+b));
		}
	}
	class demo2 extends Geometric
	{
		void addition()
		{
			int a,b,c;
			a=10;
			b=20;
			c=30;
			System.out.println("Addition of three numbers :"+(a+b+c));
		}
	}
	class demo3 extends Geometric
	{
		void addition()
		{
			int a,b,c,d;
			a=10;
			b=20;
			c=30;
			d=40;
			System.out.println("Addition of four numbers :"+(a+b+c+d));
		}
	}
	public class Program1
	{
		public static void main(String[] args)
		{
			Geometric a=null;
			demo1 b=new demo1();
			demo2 c=new demo2();
			demo3 d=new demo3();
			
			a=b;
			a.addition();
			
			a=c;
			a.addition();
			
			a=d;
			a.addition();
		}

	}


