package com.sgtesting.String;

public class StringDemo4 
{
	public static void main(String[] args) {
		reverseStr();
		
	}
	private static void reverseStr()
	{
		String s="Bangalore and Mysore";
		String s1[]=s.split(" ");
		for(String kk:s1)
		{
			System.out.print(kk+" ");
		}
		System.out.println();
		for(int i=s1.length-1;i>=0;i--)
	    {
		     System.out.print(s1[i]+" ");
	    }

}
}


