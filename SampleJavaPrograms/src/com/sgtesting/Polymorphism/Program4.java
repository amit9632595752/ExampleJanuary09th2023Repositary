package com.sgtesting.Polymorphism;

 abstract class Geometric3
	{
		abstract void perimeter();
	}
	class demo12 extends Geometric3
	{
		void perimeter()
		{
			int a=5;
			System.out.println("Perimeter of a square :"+(4*a));
		}
	}
	class demo10 extends Geometric3
	{
		void perimeter()
		{
			int l=4;
			int w=9;
			System.out.println("Perimeter of a rectangle :"+(2*(l+w)));
		}
	}
	class demo11 extends Geometric3
	{
		void perimeter()
		{
			int a=11;
			int b=9;
			int c=13;
			System.out.println("Perimeter of a traingle :"+(a+b+c));
		}
	}
	public class Program4
	{
		public static void main(String[] args)
		{
			Geometric3 o=null;
			
			demo12 a=new demo12();
			demo10 b=new demo10();
			demo11 c=new demo11();
			
			o=a;
			o.perimeter();
			
			o=b;
			o.perimeter();
			
			o=c;
			o.perimeter();

		}

	}

