package com.sgtesting.methodreturn;
class StringHalf
{
	String[] SecondHalfElement()
	{
		
		String s[]= {"Jaya","Ajay","Vijay","Akshay","Mahesh","Rudra"};
		
		int k=0;
		String b[]=new String[s.length];
		for (int i=s.length/2;i<s.length;i++)
		{
			b[k]=s[i];
			k++;
		}
		for (int i=s.length/2;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		return b;
	}
}

public class StringSecondHalf {

	public static void main(String[] args) {
		StringHalf a=new StringHalf();
		a.SecondHalfElement();
		
		{
			
		}
		
	}

}
