package com.sgtesting.methods;
class CountEvenNumber
{
	void CountEven()
	{
			
			int count=0;
			for(int i=100;i<=150;i++)
			{
			if (i%2==0)
			{
				count=count+1;
				
			}
			
			}
			System.out.println(count);
	}
	
}

public class CountEven {

	public static void main(String[] args) {
		CountEvenNumber o1=new CountEvenNumber();
		o1.CountEven();

	}

}
