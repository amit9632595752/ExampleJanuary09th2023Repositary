package com.sgtesting.methodreturn;
class TableReverse
{
	String [] demo()
	{
		String a[]=new String[10];
		int k=0;
		for(int i=10;i>=1;i--)
		{
			int r=9*i;
			String res="9  *"+i+"  ="+r;
			a[k]=res;
			k++;
		}
		return a;
	}
}

public class Tableof9th {

	public static void main(String[] args) {
		TableReverse b=new TableReverse();
		String a[]=b.demo();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}

	}

}
