package com.sgtesting.NoargsConstructor;

class Animals
{
	String AnimalName;
	String AnimalColor;
	String ForestName;
	String Location;
	Animals()
	{
		AnimalName="Tiger";
		AnimalColor="Black White";
		ForestName="Bandipur National Park";
		Location="Karnataka";
		System.out.println(AnimalName);
		System.out.println(AnimalColor);
		System.out.println(ForestName);
		System.out.println(Location);
		System.out.println("******");
	}
}

class Birds
{
	String BirdName;
	String BirdColor;
	String SancturyName;
	String Location;
	Birds()
	{
		BirdName="Little Egret";
		BirdColor="White";
		SancturyName="Mandagadde Bird Sanctury";
		Location="Mandya";
		System.out.println(BirdName);
		System.out.println(BirdColor);
		System.out.println(SancturyName);
		System.out.println(Location);
		System.out.println("**********");
	}
}

class Insect 
{
	String InsectName;
	String InsectColor;
	String ParkName;
	String Location;
	Insect()
	{
		InsectName="Butterfly";
		InsectColor="Blue";
		ParkName="Banneraghatta National Park";
		Location="Bangalore";
		System.out.println(InsectName);
		System.out.println(InsectColor);
		System.out.println(ParkName);
		System.out.println(Location);
	}
	
}
public class Program5Noargs {

	public static void main(String[] args) {
		Animals a=new Animals();
		
		
		Birds b=new Birds();
		
		
		Insect i=new Insect();
		
		
	}

}

