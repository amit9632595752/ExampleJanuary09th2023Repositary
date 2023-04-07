package com.sgtesting.NoargsConstructor;

class Country
{
	String CountryName;
	int NoofStates;
	int NoofUnionTerritory;
	String NationalAnimal;
	Country()
	{
		CountryName="India";
		NoofStates=28;
		NoofUnionTerritory=8;
		NationalAnimal="Tiger";
		System.out.println(CountryName);
		System.out.println(NoofStates);
		System.out.println(NoofUnionTerritory);
		System.out.println(NationalAnimal);
		System.out.println("************");
	}
}

class State
{
	String StateName;
	int NoofDistricts;
	String StateCapital;
	String StateBird;
	State()
	{
		StateName="Karnatak";
		NoofDistricts=31;
		StateCapital="Bangalore";
		StateBird="Indian Roller";
		System.out.println(StateName);
		System.out.println(NoofDistricts);
		System.out.println(StateCapital);
		System.out.println(StateBird);
		System.out.println("************");
	}
}

class District
{
	String DistrictName;
	int NoofTalluk;
	int NoofMLASeats;
	int NoofMPSeats;
	District()
	{
		DistrictName="Bijapur";
		NoofTalluk=5;
		NoofMLASeats=7;
		NoofMPSeats=1;
		System.out.println(DistrictName);
		System.out.println(NoofTalluk);
		System.out.println(NoofMLASeats);
		System.out.println(NoofMPSeats);
	}
}

public class Program6Noargs {

	public static void main(String[] args) {
		Country i=new Country();
		
		
		State k=new State();
		
		
		District b=new District();
		
		


	}

}

