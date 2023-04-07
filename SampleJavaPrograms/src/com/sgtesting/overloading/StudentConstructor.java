package com.sgtesting.overloading;
class Student
{
	Student(String SName,int Studentid)
	{
		System.out.println("Student Name;"+SName);
		System.out.println("Student ID:"+Studentid);
	}
	Student(String schoolName,String Studentloc)
	{
		System.out.println("School Name:"+schoolName);
		System.out.println("Student Location:"+Studentloc);
	}
	Student(int standard,String schoolloc)
	{
		System.out.println("Student Standard:"+standard);
		System.out.println("School Location:"+schoolloc);
	}
	Student(int studentmarks,double studentattendence)
	{
		System.out.println("Student Marks:"+studentmarks);
		System.out.println("Student Attendence:"+studentattendence);
	}
}

public class StudentConstructor {

	public static void main(String[] args) {
		Student a=new Student("viraj",132);
		Student b=new Student("Bishop Cottons","Bangalore");
		Student c=new Student(10,"M G Road");
		Student d=new Student(87,89.50);
		
		

	}

}
