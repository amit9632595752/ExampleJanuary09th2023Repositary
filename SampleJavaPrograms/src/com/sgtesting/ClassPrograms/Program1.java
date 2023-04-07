package com.sgtesting.ClassPrograms;
class Employee
{
	String EmployeeName;
	int EmployeeNumber;
	int EmployeeAge;
	int EployeeSalary;
	
}

class Department
{
	String DName;
	String HodName;
	int DeptNo;
	int NumberofMembers;
}

class Insurance
{
	String IName;
	String IDate;
	int INumber;
	int IAmount;
}

public class Program1 {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.EmployeeName="Akshay";
		e.EmployeeNumber=232543;
		e.EmployeeAge=24;
		e.EployeeSalary=30000;
		System.out.println(e.EmployeeName);
		System.out.println(e.EmployeeNumber);
		System.out.println(e.EmployeeAge);
		System.out.println(e.EployeeSalary);
		System.out.println("*************");
	
		
		Department d=new Department();
		d.DName="Mechanical Engineering";
		d.HodName="Satyamurthy";
		d.DeptNo=3;
		d.NumberofMembers=15;
		System.out.println(d.DName);
		System.out.println(d.HodName);
		System.out.println(d.DeptNo);
		System.out.println(d.NumberofMembers);
		System.out.println("**********");
		
		Insurance i=new Insurance();
		i.IName="LIC";
		i.IDate="12-MAY-2022";
		i.INumber=35354;
		i.IAmount=3000;
		System.out.println(i.IName);
		System.out.println(i.IDate);
		System.out.println(i.INumber);
		System.out.println(i.IAmount);
		

		
	}

}
