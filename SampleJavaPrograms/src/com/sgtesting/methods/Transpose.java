package com.sgtesting.methods;
class TransposeMatrix
{
	void TransposeArray(int a[][])
	{
		int transpose[][]=new int[3][3];
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				transpose[i][j]=a[i][j];
			}
		}
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

public class Transpose {

	public static void main(String[] args) {
		TransposeMatrix a=new TransposeMatrix();
		int arr[][]= {{5,10,15},{20,25,30},{35,40,45}};
		a.TransposeArray(arr);
	}

}
