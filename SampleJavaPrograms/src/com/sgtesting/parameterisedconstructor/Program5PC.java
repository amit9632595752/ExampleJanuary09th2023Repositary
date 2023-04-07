package com.sgtesting.parameterisedconstructor;

class Animals
{
	String AnimalName;
	String AnimalColor;
	String ForestName;
	String Location1;
	Animals(String an,String ac,String fn,String loc1)
	{
		AnimalName=an;
		AnimalColor=ac;
		ForestName=fn;
		Location1=loc1;
		System.out.println(AnimalName);
		System.out.println(AnimalColor);
		System.out.println(ForestName);
		System.out.println(Location1);
		System.out.println("******");
	}

}

class Birds
{
	String BirdName;
	String BirdColor;
	String SancturyName;
	String Location2;
	Birds(String bn,String bc,String sn,String loc2)
	{
		BirdName=bn;
		BirdColor=bc;
		SancturyName=sn;
		Location2=loc2;
		System.out.println(BirdName);
		System.out.println(BirdColor);
		System.out.println(SancturyName);
		System.out.println(Location2);
		System.out.println("**********");
	}
}

class Insect 
{
	String InsectName;
	String InsectColor;
	String ParkName;
	String Location3;
	Insect(String in,String ic,String pn,String loc3)
	{
		InsectName=in;
		InsectColor=ic;
		ParkName=pn;
		Location3=loc3;
		System.out.println(InsectName);
		System.out.println(InsectColor);
		System.out.println(ParkName);
		System.out.println(Location3);
		
	}
	
}
public class Program5PC {

	public static void main(String[] args) {
		Animals a=new Animals("Tiger","Black White","Bandipur National Park","Karnataka");
		
		
		
		Birds b=new Birds("Little Egret","White","Mandagadde Bird Sanctury","Mandya");
	
		
		
		Insect i=new Insect("Butterfly","Blue","Banneraghatta National Park","Bangalore");
		
		
		
	}

}
