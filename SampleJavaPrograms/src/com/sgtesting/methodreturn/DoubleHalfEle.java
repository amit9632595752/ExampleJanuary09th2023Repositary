package com.sgtesting.methodreturn;
class DoubleArray
{
	double[] HalfElement(double d[])
	{
		double c[]=new double[d.length];
		int k=0;
		for(int i=0;i<d.length;i++)
		{
			c[k]=d[i];
			k++;
		}
		return c;
	}
}

public class DoubleHalfEle {

	public static void main(String[] args) {
		DoubleArray a=new DoubleArray();
		double d[]= {1.2,2.3,3.4,4.5,5.6,6.7};
		a.HalfElement(d);
		for (int j=0;j<d.length/2;j++)
		{
			System.out.println(d[j]);
		}

	}
}
