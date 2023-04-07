package com.sgtesting.ClassPrograms;
class Animals
{
	String AnimalName;
	String AnimalColor;
	String ForestName;
	String Location;
}

class Birds
{
	String BirdName;
	String BirdColor;
	String SancturyName;
	String Location;
}

class Insect 
{
	String InsectName;
	String InsectColor;
	String ParkName;
	String Location;
	
}
public class Program5 {

	public static void main(String[] args) {
		Animals a=new Animals();
		a.AnimalName="Tiger";
		a.AnimalColor="Black White";
		a.ForestName="Bandipur National Park";
		a.Location="Karnataka";
		System.out.println(a.AnimalName);
		System.out.println(a.AnimalColor);
		System.out.println(a.ForestName);
		System.out.println(a.Location);
		System.out.println("******");
		
		Birds b=new Birds();
		b.BirdName="Little Egret";
		b.BirdColor="White";
		b.SancturyName="Mandagadde Bird Sanctury";
		b.Location="Mandya";
		System.out.println(b.BirdName);
		System.out.println(b.BirdColor);
		System.out.println(b.SancturyName);
		System.out.println(b.Location);
		System.out.println("**********");
		
		Insect i=new Insect();
		i.InsectName="Butterfly";
		i.InsectColor="Blue";
		i.ParkName="Banneraghatta National Park";
		i.Location="Bangalore";
		System.out.println(i.InsectName);
		System.out.println(i.InsectColor);
		System.out.println(i.ParkName);
		System.out.println(i.Location);
		
	}

}
