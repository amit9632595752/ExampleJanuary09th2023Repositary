package com.sgtesting.String;

public class PalindromeOrNot
{

	public static void main(String[] args) {
		palindrome();
	}
		private static void palindrome()
		{
			String s="GadaG";
			  boolean isPalindrome = true;
		        for(int i=0;i<s.length()/2;i++) 
		        {
		            if(s.charAt(i)!=s.charAt(s.length()-1-i)) 
		            {
		                isPalindrome = false;
		                break;
		            }
		        }
	            if(isPalindrome) 
		        {
	            	System.out.println("The input string is a palindrome.");
			    }
		        else 
		        { 
		            System.out.println("The input string is not a palindrome" );
		        }        	
		} 

}
