package com.sgtesting.methodreturn;
class Prime
{
	int []demo ()
	{
		int count=0;
		for(int i=1;i<=50;i++)
		{
			int a=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					a=a+1;
					break;
				}
			}
			if(a==0)
			{
				count=count+1;
				
			}
			
			}
			int b[]=new int[count];
			int k=0;
			for(int i=1;i<=50;i++)
			{
				int a=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						a=a+1;
						break;
					}
				}
				if(a==0)
				{
					b[k]=i;
					k++;
				}
			}
			return b;
	}
}

public class PrimeNumber {

	public static void main(String[] args) {
		Prime a=new Prime();
		int res[]=a.demo();
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}

}
