package com.sgtesting.overloading;
class Employee
{
	Employee (String EmpName)
	{
		System.out.println("Employee Name : "+EmpName);
	}
	Employee (int Empid,String Emploc)
	
	{
		System.out.println("Employee Id :"+Empid);
		System.out.println("Employee Location :"+Emploc);
	}
	Employee (String JobName,int EmpSal)
	{
		System.out.println("Job Name :"+JobName);
		System.out.println("Eployee Salary :"+EmpSal);
	}
}

public class EmployeeConstructor {
	

	public static void main(String[] args) {
		
		Employee a=new Employee("Akshay");
		Employee c=new Employee(10,"Bangalore");
		Employee d=new Employee("Manager",30000);
	

	}

}
