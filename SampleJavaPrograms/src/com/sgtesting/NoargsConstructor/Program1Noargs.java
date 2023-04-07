package com.sgtesting.NoargsConstructor;

class Employee
{
	String EmployeeName;
	int EmployeeNumber;
	int EmployeeAge;
	int EployeeSalary;
	Employee()
	{
	EmployeeName="Akshay";
	EmployeeNumber=232543;
	EmployeeAge=24;
	EployeeSalary=30000;
	System.out.println(EmployeeName);
	System.out.println(EmployeeNumber);
	System.out.println(EmployeeAge);
	System.out.println(EployeeSalary);
	System.out.println("*************");
	}
	
}

class Department
{
	String DName;
	String HodName;
	int DeptNo;
	int NumberofMembers;
	Department()
	{
	DName="Mechanical Engineering";
	HodName="Satyamurthy";
	DeptNo=3;
	NumberofMembers=15;
	System.out.println(DName);
	System.out.println(HodName);
	System.out.println(DeptNo);
	System.out.println(NumberofMembers);
	System.out.println("**********");
	}
}

class Insurance
{
	String IName;
	String IDate;
	int INumber;
	int IAmount;
	Insurance()
	{
		IName="LIC";
		IDate="12-MAY-2022";
		INumber=35354;
		IAmount=3000;
		System.out.println(IName);
		System.out.println(IDate);
		System.out.println(INumber);
		System.out.println(IAmount);
	}
}

public class Program1Noargs {

	public static void main(String[] args) {
		Employee e=new Employee();
		
	
		
		Department d=new Department();
		
		
		Insurance i=new Insurance();
		
		

		
	}

}
