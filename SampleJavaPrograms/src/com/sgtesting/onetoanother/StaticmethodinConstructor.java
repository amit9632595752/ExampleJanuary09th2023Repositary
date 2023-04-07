package com.sgtesting.onetoanother;
class StaticMe
{
	static void display()
	{
		Constructor a=new Constructor(10,20);
		System.out.println("Static Method");
	}
}
class Constructor
{
	Constructor(int a,int b)
	{
		int res=a*b;
		System.out.println("Constructor "+res);
	}
}

public class StaticmethodinConstructor {

	public static void main(String[] args) {
		StaticMe.display();
		

	}

}
