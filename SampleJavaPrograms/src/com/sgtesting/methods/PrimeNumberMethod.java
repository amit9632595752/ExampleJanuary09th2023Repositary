package com.sgtesting.methods;
class PrimeNumberDemo
{
	void PrimeNum()
	{
		int num=1;
		while(num<=50)
		{
			int a=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					a=a+1;
					break;
				}
			}
			if(a==0)
			{
				System.out.println(num);
			}
			num++;
		}
		
	}

}

public class PrimeNumberMethod {

	public static void main(String[] args) {
		PrimeNumberDemo a=new PrimeNumberDemo();
		a.PrimeNum();

	}

}
