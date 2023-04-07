package com.sgtesting.methods;
class SubofArray
{
	void ArraySub(int a[],int b[])
	{
		int c[]=new int[a.length];
		for(int i=0;i<a.length-1
				;i++)
		{
			c[i]=a[i]-b[i];
		}
		for(int i=0;i<c.length-1;i++)
		{
			System.out.println(c[i]);
		}
	}
}

public class ArraySubstraction {

	public static void main(String[] args) {
		SubofArray a=new SubofArray();
		int d[]= {50,100,150,200};
		int e[]= {10,30,50,100};
		a.ArraySub(d,e);

	}

}
