package com.sgtesting.methods;
class TwoDArrayLastRow
{
	void ArrayElement(char a [][])
	{
		
		for(int i=2;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			System.out.print(a[i][j]+"  ");
		}
		System.out.println();
	}
}

public class Program10 {

	public static void main(String[] args) {
		TwoDArrayLastRow a=new TwoDArrayLastRow();
		char  ch[][]={{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		a.ArrayElement(ch);
		

	}

}
