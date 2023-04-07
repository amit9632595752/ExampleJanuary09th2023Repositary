package com.sgtesting.String;

public class StringDemo2
{
	public static void main(String[] args) {
		 Stringpattern();

	}
	private static void Stringpattern()
	{
		String s=new String("Programing");
		int l=s.length();
	    for(int i=0;i<=l;i++)
	    {
	    	for(int j=0;j<i;j++)
	    	{
	    		System.out.print(s.charAt(j));
	    	}
	    	System.out.println();
	    }
		
	}

}



