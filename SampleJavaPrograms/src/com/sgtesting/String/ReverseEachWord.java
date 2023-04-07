package com.sgtesting.String;

public class ReverseEachWord
{
	public static void main(String[] args) {
		EachWord();
	}
	private static void EachWord()
	{
		String str=new String("The temple is at the top of the hill");
		 String[] words = str.split(" ");
	        String rev = "";
	        for (String word : words) 
	        {
	            String revWord = "";

	            for (int i = word.length()-1; i >= 0; i--) 
	            {
	                revWord += word.charAt(i);
	            }
	            rev += revWord + " ";
	        }
	        System.out.println("Original string: " + str);
	        System.out.println("Reversed string: " + rev);		
	}
}


