
package com.sgtesting.String;

public class FindWordCount
{
	public static void main(String[] args) {
		SplitStr();
		
	}
     private static void SplitStr()
     {
    	 String s="The Temple is at the top of the hill";
    	 String s1[]=s.split(" ");
    	 int count=0;
    	 for(String kk:s1)
    	 {
    		 count++;
    	 }
    	 System.out.println("Number of words: "+count);
     }
}


