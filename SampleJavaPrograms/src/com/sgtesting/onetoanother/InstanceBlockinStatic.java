package com.sgtesting.onetoanother;
class InstanceBlock
{
	{
		
	int a=10;
	int b=20;
	int res=a+b;
	System.out.println("Istance Block "+res);
	}
}
class ProgramDemo
{
	static int multi()
	{
		InstanceBlock o=new InstanceBlock();
		int a=10;
		int b=20;
		int res=a*b;
		return res;
	}
}
public class InstanceBlockinStatic {

	public static void main(String[] args) {
		int c=ProgramDemo.multi();
		System.out.println(c);

	}

}
