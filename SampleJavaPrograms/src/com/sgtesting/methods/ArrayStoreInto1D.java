package com.sgtesting.methods;
class Storein1D
{
	void Array(int a[][])
	{
		int k=0;
		int c[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[k]=a[i][j];
				k++;
			}
		}
		for (int z=8;z>=0;z--)
		{
			System.out.println(c[z]);
		}
	}
}

public class ArrayStoreInto1D {

	public static void main(String[] args) {
		Storein1D a=new Storein1D();
		int arr [][]= {{100,200,300},{400,500,600},{700,800,900}};
		a.Array(arr);
	}

}
