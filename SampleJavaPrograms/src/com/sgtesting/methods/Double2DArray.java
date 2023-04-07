package com.sgtesting.methods;
class DoubleArray
{
	void Double(double d[][])
	{
		for( int i=d.length-1;i>=0;i--)
		{
			for(int j=d[i].length-1;j>=0;j--)
			{
				System.out.print(d[i][j]+"  ");	                        
			}
			System.out.println();
		}
	}

}

public class Double2DArray {

	public static void main(String[] args) {
		DoubleArray a=new DoubleArray();
		double c[][]= {{1.5,2.5,3.5},{4.5,5.5,6.5}};
		a.Double(c);
		
	}

}

