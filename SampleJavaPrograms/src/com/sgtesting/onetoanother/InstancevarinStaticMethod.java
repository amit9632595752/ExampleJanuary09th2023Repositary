package com.sgtesting.onetoanother;
class StaticVar
{
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println("Instance "+res);
	}
}
class StaticDemo
{
	static void display()
	{
		int a=10;
		int b=20;
		int res=a*b;
		System.out.println("Static Method "+res);
	}
}

public class InstancevarinStaticMethod {

	public static void main(String[] args) {
		StaticDemo.display();
	}

}
