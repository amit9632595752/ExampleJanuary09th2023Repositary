package com.sgtesting.methodreturn;
class DoubleArray2DDemo
{
	double [][] demo(double a[][], double b[][])
	{
		double c[][]=new double[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}	
		}
		return c;
	}	
}

public class ArrayDouble2D {

	public static void main(String[] args) {
		DoubleArray2DDemo o=new DoubleArray2DDemo();
		double d1[][]={{11.2,22.3,34.4},{45.5,56.1,61.7}};
		double d2[][]= {{1.1,2.2,3.2},{4.1,5.2,6.3}};
		double z[][]=o.demo(d1,d2);
		
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z[i].length;j++)
			{
				System.out.print(z[i][j]+"  ");
			}
			System.out.println();
		}
	}

}

