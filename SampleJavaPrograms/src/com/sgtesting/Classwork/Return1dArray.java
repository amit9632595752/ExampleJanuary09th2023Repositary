package com.sgtesting.Classwork;
class CharArray
{
	char[] getonedimenstionalarray()
	{
		char a[]= {'a','b','c','d','e','f'};
		return a;
	}
	
}

public class Return1dArray {

	public static void main(String[] args) {
		CharArray o=new CharArray();
		char ch[]=o.getonedimenstionalarray();
		
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);

	}

}
