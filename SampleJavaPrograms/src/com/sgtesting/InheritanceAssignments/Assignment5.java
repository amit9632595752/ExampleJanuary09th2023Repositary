
package com.sgtesting.InheritanceAssignments;

class Test1
{
 Test1 (String s)
 {
	System.out.println("String parameterzid datatatype constructor"); 
 }
 Test1 (int a)
 {
	 System.out.println("Int parameterized datatype constructor");
 }
}

class Test2 extends Test1
{
	 Test2(String str)
 {
	 super(str);
 }
 Test2(int val)
 {
	super(val); 
 }
}
 class Test3 extends Test2
 {
	 Test3(String str1)
	 {
	 super(str1);
 }
	 Test3(int val1)
	 {
		 super(val1);
	 }
}
public class Assignment5
{
	public static void main(String []args)
	{
		Test3 a1=new Test3("Testing");
		Test3 a2=new Test3("10");
	}
}
