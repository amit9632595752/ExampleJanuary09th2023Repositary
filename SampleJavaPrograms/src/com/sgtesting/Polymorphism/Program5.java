package com.sgtesting.Polymorphism;

	abstract class Geometric4
	{
		abstract void division();
	}
	class demo13 extends Geometric4
	{
		void division()
		{
			int a,b;
			a=40;
			b=20;
			System.out.println("division of two numbers :"+(a/b));
		}
	}
	class demo14 extends Geometric4
	{
		void division()
		{
			int a,b,c;
			a=120;
			b=2;
			c=2;
			double d=((a/b)/c);
			System.out.println("division of three numbers :"+d);
		}
	}
	class demo15 extends Geometric4
	{
		void division()
		{
			int a,b,c,d;
			a=90;
			b=3;
			c=3;
			d=1;
			double e=(a/b/c/d);
			System.out.println("division of four numbers :"+e);
		}
	}

	public class Program5
	{
		public static void main(String[] args)
		{
			Geometric4 o=null;
			
			demo13 a=new demo13();
			demo14 b=new demo14();
			demo15 c=new demo15();
			
			o=a;
			o.division();
			
			o=b;
			o.division();
			
			o=c;
			o.division();

		}

	}


