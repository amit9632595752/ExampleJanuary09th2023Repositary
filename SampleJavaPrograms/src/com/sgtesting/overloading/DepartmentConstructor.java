package com.sgtesting.overloading;
class Department
{
	Department (String DName)
	{
		System.out.println("DName: "+DName);
	}
	Department (int Dno)
	{
		System.out.println("Dept Number : "+ Dno);
	}
	Department (String Dloc,String HName)
	{
		System.out.println("Dept Loc :"+Dloc);
		System.out.println("HOD name :"+HName);
	}
}

public class DepartmentConstructor {

	public static void main(String[] args) {
		Department a=new Department("Mechanical");
		Department b=new Department(12);
		Department c= new Department("Bangalore","Satyamurthy");
		

	}

}
