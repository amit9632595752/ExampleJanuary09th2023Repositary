
package com.sgtesting.methods;
class AdditionMatrix
{
	void AdditionofMatrix(int a[][],int b[][])
	{
		int c[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
			c[i][j]	=a[i][j]+b[i][j];	
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class AdditionofMatrix {

	public static void main(String[] args) {
		AdditionMatrix a=new AdditionMatrix();
		int arr1[][]= {{2,4},{4,6}};
		int arr2[][]= {{3,6},{6,9}};
		a.AdditionofMatrix(arr1,arr2);	
	}

}
