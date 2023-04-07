package com.sgtesting.onetoanother;
class Static
{
	static int add(int a, int b)
	{
		 
		int res=a+b;
		return res;
	}
}
class StaticBlock
{
	static
	{
		int c=Static.add(10,20);
		System.out.println("static Block");
		System.out.println(c);
	}
}

public class StatictoStaticBlock {

	public static void main(String[] args) {
		StaticBlock a=new StaticBlock();

	}

}
