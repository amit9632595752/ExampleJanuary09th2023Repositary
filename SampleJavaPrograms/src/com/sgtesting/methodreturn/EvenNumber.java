package com.sgtesting.methodreturn;
class EvenNum
{
	int [] demo()
	{
		int count=0;
		for(int i=60;i>=20;i--)
		{
			if(i%2==0)
			{
				count=count+1;
				
			}
		}
		int a[]=new int [count];
		int k=0;
		for(int j=60;j>=20;j--)
		{
			if(j%2==0)
			{
				a[k]=j;
				k++;
			}
		}
		
		return a;
		
		
	}
	
}

public class EvenNumber {

	public static void main(String[] args) {
		EvenNum o=new EvenNum();
		int a[]=o.demo();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}


