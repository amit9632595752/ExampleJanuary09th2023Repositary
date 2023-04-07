package com.sgtesting.String;

public class UsingToCharMethod
{
	public static void main(String[] args) {
		getcharacter();
	}
	private static void getcharacter()
	{
		String s ="Aditya";
		char ch[]=s.toCharArray();
		System.out.println("Character in reverse order : ");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}	
	}
}


