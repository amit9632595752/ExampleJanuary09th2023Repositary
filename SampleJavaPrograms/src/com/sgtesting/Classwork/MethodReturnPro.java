package com.sgtesting.Classwork;
class ReturnMethod
{
	String getname(String name)
	{
		return name;
	}
}

public class MethodReturnPro {

	public static void main(String[] args) {
		ReturnMethod a=new ReturnMethod();
		String s=a.getname("Sweety");
		System.out.println(s);

	}

}
