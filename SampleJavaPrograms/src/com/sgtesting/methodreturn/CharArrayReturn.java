package com.sgtesting.methodreturn;
class CharArray
{
	char [] Demo(char ch[])
	{
		char a[]=new char[ch.length];
		
		int k=0;
		for (int i=ch.length-1;i>=0;i--)
		{
			
			a[k]=ch[i];
			k++;
		}
		return a;
	}		
}

public class CharArrayReturn {

	public static void main(String[] args) {
		CharArray o=new CharArray();
		char c[]= {'A','B','C','D','E','F'};
		char b[]=o.Demo(c);
		for(int j=0;j<b.length;j++)
		{
				System.out.println(b[j]);
		}
	}

}
