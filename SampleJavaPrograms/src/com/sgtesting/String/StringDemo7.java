package com.sgtesting.String;

public class StringDemo7
{
	public static void main(String[] args) {
		reverseStr1();
		insertStr();

	}
	private static void reverseStr1()
	{
		String s=new String("SUNDAYMONDAYTUESDAYWENDSDAYTHURSDAYFRIDAYSATURDAY");
	
			System.out.print(s.replace("DAY",""));
		    System.out.println();
	}
	private static void insertStr()
	{
		String s="SUNDAYMONDAYTUESDAYWENDSDAYTHURSDAYFRIDAYSATURDAY";
		String s1[]=s.split("DAY");
		for(String kk:s1)
		{
			System.out.print(kk+"DAY,");
		}
		
	}
	
}



