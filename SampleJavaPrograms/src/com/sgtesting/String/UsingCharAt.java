package com.sgtesting.String;

public class UsingCharAt
{
	public static void main(String[] args) {
		getcharacter();
	}
	private static void getcharacter()
	{
		String s ="Amit";
		System.out.println("Character in reverse order : ");
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			System.out.println(ch);
		}
	}
}


