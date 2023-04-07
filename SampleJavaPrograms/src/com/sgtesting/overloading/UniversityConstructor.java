package com.sgtesting.overloading;
class University
{
	University(String UName,String Region)
	{
		System.out.println("University Name:"+UName);
		System.out.println("Region of UV:"+Region);
	}
	University(int noofBranches,String location)
	{
		System.out.println("Number of Branches:"+noofBranches);
		System.out.println("Location:"+location);
	}
	University(String principalName)
	{
		System.out.println("Principal Name:"+principalName);
	}
}

public class UniversityConstructor {

	public static void main(String[] args) {
		University a=new University("RGIT","Banagalore");
		University b=new University(12,"Hebbal");
		University c= new University("Anand");
		
	}

}
