package com.sgtesting.parameterisedconstructor;

class Employee
{
	String EmployeeName;
	int EmployeeNumber;
	int EmployeeAge;
	int EployeeSalary;
	Employee(String en,int enu,int eage,int esal)
	{
		EmployeeName=en;
		EmployeeNumber=enu;
		EmployeeAge=eage;
		EployeeSalary=esal;
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
	Department(String dname,String hn,int dno,int nom)
	{
		DName=dname;
		HodName=hn;
		DeptNo=dno;
		NumberofMembers=nom;
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
	Insurance(String in,String id,int ino,int ia)
	{
		IName=in;
		IDate=id;
		INumber=ino;
		IAmount=ia;
		System.out.println(IName);
		System.out.println(IDate);
		System.out.println(INumber);
		System.out.println(IAmount);
		
	}
}

public class Program1PC {

	public static void main(String[] args) {
		Employee e=new Employee("Akshay",232543,24,30000);
		
		
		Department d=new Department("Mechanical Engineering","Satyamurthy",3,15);
		
		
		Insurance i=new Insurance("LIC","12-MAY-2022",35354,3000);
		
		

		
	}

}
