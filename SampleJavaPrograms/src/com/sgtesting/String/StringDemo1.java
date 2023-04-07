package com.sgtesting.String;
//without using length method find out the number of character available in the given string
public class StringDemo1
{

		public static void main(String[] args)
		{
			Stringlength();
		}
		
	    private static void Stringlength()
	    {
	    	String s= "Automation";
	    	char ch[]=s.toCharArray();
	    	int count=0;
	    	for(char kk:ch)
	    	{
	    		
				count++;
	    		
	    	}
	    	System.out.println("No of charactor in the String: "+count);
	    }
	}

