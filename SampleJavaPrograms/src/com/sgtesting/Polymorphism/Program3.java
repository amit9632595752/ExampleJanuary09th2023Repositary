package com.sgtesting.Polymorphism;

	abstract class Geometric2
	{
		abstract void Multiply();
	}
	class demo7 extends Geometric2
	{
		void Multiply()
		{
			int a,b;
			a=9;
			b=20;
			System.out.println("Multiplication of two numbers :"+(a*b));
		}
	}
	class demo8 extends Geometric2
	{
		void Multiply()
		{
			int a,b,c;
			a=21;
			b=2;
			c=3;
			System.out.println("Multiplication of three numbers :"+(a*b*c));
		}
	}
	class demo9 extends Geometric2
	{
		void Multiply()
		{
			int a,b,c,d;
			a=19;
			b=2;
			c=3;
			d=4;
			System.out.println("Multiplication of four numbers :"+(a*b*c*d));
		}
	}

	public class Program3
	{

		public static void main(String[] args)
		{
			Geometric2 o=null;
			
			demo7 a=new demo7();
			demo8 b=new demo8();
			demo9 c=new demo9();
			
			o=a;
			a.Multiply();
			
			o=b;
			o.Multiply();
			
			o=c;
			o.Multiply();
		}
	}


