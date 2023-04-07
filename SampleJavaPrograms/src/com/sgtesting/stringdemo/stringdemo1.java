package com.sgtesting.stringdemo;

public class stringdemo1
{
	public static void main(String []args)
	{
		String s1="Testing";
		String s2="Testing";
		String s3="Testing";
		
		String s4=new String("Testing");
		String s5=new String("Testing");
		String s6=new String("Testing");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s4==s6);
	}

}
