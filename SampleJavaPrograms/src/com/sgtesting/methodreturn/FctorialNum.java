package com.sgtesting.methodreturn;
class FactorialReturn
{
	int demo (int a)
	{
		int res=1;
		for(int i=a;i>=1;i--)
		{
			res=res+i;
		}
		return res;
	}
}

public class FctorialNum {

	public static void main(String[] args) {
		FactorialReturn a=new FactorialReturn();
		int res=a.demo(5);
		System.out.println("Factorial of given Numbewr is :"+res);
		

	}

}
