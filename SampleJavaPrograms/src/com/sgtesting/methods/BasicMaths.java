package com.sgtesting.methods;
class MathsDemo
{
	void Addition(int x,int y)
	{	
		int res=x+y;
		System.out.println("Addition:"+res);
		
		
		
	}
	void Sub(int a, int b)
	{	
		int res=a-b;
		System.out.println("Sub :"+res);
	}
	void Mult(int c,int d)
	{
		int res=c*d;
		System.out.println("Mult :"+res);
	}
	void Division(int m,int n)
	{
		int res=m/n;
		System.out.println("Div :"+res);
			
	}
}

public class BasicMaths {

	public static void main(String[] args) {
		MathsDemo o1=new MathsDemo();
		o1.Addition(3,6);
		o1.Sub(6,2);

	}

}
