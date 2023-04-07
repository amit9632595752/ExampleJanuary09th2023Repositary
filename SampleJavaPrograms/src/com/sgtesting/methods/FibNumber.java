package com.sgtesting.methods;
class FibenousNumbr
{
	void FibNumber()
	{
		int firstnum=0;
		int secondnum=1;
		System.out.println(firstnum+" "+secondnum);
		for(int i=1;i<=20;i++)
		{
			int thirdnum=firstnum+secondnum;
			System.out.println(" "+thirdnum);
			firstnum=secondnum;
			secondnum=thirdnum; 
		}
	}
}

public class FibNumber {

	public static void main(String[] args) {
		FibenousNumbr a=new FibenousNumbr();
		a.FibNumber();
		
	}

}
