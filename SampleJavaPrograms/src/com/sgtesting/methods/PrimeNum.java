package com.sgtesting.methods;
class PrimeNumber
{
	void PrimeNum(int num)
	{
		
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
						
						
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+" is not a Prime  Number");
		}
	}
}

public class PrimeNum {

	public static void main(String[] args) {
		PrimeNumber o1=new PrimeNumber();
		o1.PrimeNum(10);
		
		

	}

}
