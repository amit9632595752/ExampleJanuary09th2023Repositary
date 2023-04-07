package com.sgtesting.abstractclassAssignments;

 class Methods
{
	static void Student(String name)
	{
		System.out.println("Student Name: "+name);
	}
	static int viewNo(int rollno)
	{
		return rollno;
	}
	static void Branchname(String[] Branch)
	{
		System.out.println("Branch Names: ");
		for(int i=0;i<Branch.length;i++)
		{
			System.out.println(Branch[i]);
		}
	}
}
public class StaticMethods
{
	public static void main(String[] args)
	{
		Methods.Student("Amit");
		int b=Methods.viewNo(79);
		System.out.println("Roll No: "+b);
		String[] s= {"Mechanical", "Automobile"};
		Methods.Branchname(s);
	}
}

