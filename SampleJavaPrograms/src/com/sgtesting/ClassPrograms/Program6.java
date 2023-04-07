package com.sgtesting.ClassPrograms;

import java.security.InvalidKeyException;

class Country
{
	String CountryName;
	int NoofStates;
	int NoofUnionTerritory;
	String NationalAnimal;
}

class State
{
	String StateName;
	int NoofDistricts;
	String StateCapital;
	String StateBird;
}

class District
{
	String DistrictName;
	int NoofTalluk;
	int NoofMLASeats;
	int NoofMPSeats;
}

public class Program6 {

	public static void main(String[] args) {
		Country i=new Country();
		i.CountryName="India";
		i.NoofStates=28;
		i.NoofUnionTerritory=8;
		i.NationalAnimal="Tiger";
		System.out.println(i.CountryName);
		System.out.println(i.NoofStates);
		System.out.println(i.NoofUnionTerritory);
		System.out.println(i.NationalAnimal);
		System.out.println("************");
		
		State k=new State();
		k.StateName="Karnatak";
		k.NoofDistricts=31;
		k.StateCapital="Bangalore";
		k.StateBird="Indian Roller";
		System.out.println(k.StateName);
		System.out.println(k.NoofDistricts);
		System.out.println(k.StateCapital);
		System.out.println(k.StateBird);
		System.out.println("************");
		
		District b=new District();
		b.DistrictName="Bijapur";
		b.NoofTalluk=5;
		b.NoofMLASeats=7;
		b.NoofMPSeats=1;
		System.out.println(b.DistrictName);
		System.out.println(b.NoofTalluk);
		System.out.println(b.NoofMLASeats);
		System.out.println(b.NoofMPSeats);
		


	}

}
