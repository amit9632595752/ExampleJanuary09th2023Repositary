package com.sgtesting.Classwork;
class Onedaray
{
	char[] getarray()
	{
		char a[]= {'a','b','c','d','e','f'};
		return a;
	}
}

public class OneDarray {

	public static void main(String[] args) {
		Onedaray o=new Onedaray();
		char ch[]=o.getarray();
		
		System.out.println(" read first half of elemrnts");
		for(int i=0;i<ch.length/2;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("+++++++++++++++++");
		System.out.println("read second half of elements");
		for(int i=ch.length/2;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("+++++++++++++");
		System.out.println("read elements in revers order");
		for(int i=ch.length-1;i>=0;i--)
			System.out.println(ch[i]);
		

	}

}
