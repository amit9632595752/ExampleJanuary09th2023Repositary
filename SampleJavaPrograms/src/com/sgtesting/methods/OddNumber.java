package com.sgtesting.methods;
class OddNum
{
	void OddNumber(int num)
	{
		for(int i=0;i<num;i++)
		{
			if(num%2!=0)
			{
				
					System.out.println(num+" is a Odd Number");
			}
			else
			{
				
			}
		}
		System.out.println(num+" is not a Odd Number");
	}
}
public class OddNumber{

		public static void main(String[] args) {
		OddNum o1=new OddNum();
		o1.OddNumber(12);
			
	}
}
