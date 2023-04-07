package com.sgtesting.methodreturn;
class Array2dAddition
{
	int [][] demo(int a[][],int b[][])
	{
		int c[][]=new int [a.length][a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}

public class AdditionArray2D {

	public static void main(String[] args) {
		Array2dAddition a=new Array2dAddition();
		int a1[][]= {{50,30,40},{40,50,60},{70,80,90}};
		int a2[][]= {{5,10,15},{20,25,30},{35,40,45}};
		int z[][]=a.demo(a1, a2);
		
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
