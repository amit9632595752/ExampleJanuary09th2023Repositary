package com.sgtesting.parameterisedconstructor;

class Country
{
	String CountryName;
	int NoofStates;
	int NoofUnionTerritory;
	String NationalAnimal;
	Country(String cn,int st,int ut,String na)
	{
		CountryName=cn;
		NoofStates=st;
		NoofUnionTerritory=ut;
		NationalAnimal=na;
		System.out.println("Country Name: "+CountryName);
		System.out.println("No of States: "+NoofStates);
		System.out.println("No of UTs: "+NoofUnionTerritory);
		System.out.println("National Animal: "+NationalAnimal);
		System.out.println("************");
	}
}

class State
{
	String StateName;
	int NoofDistricts;
	String StateCapital;
	String StateBird;
	State(String sn,int dist,String scap,String sb)
	{
		StateName=sn;
		NoofDistricts=dist;
		StateCapital=scap;
		StateBird=sb;
		System.out.println("State Name: "+StateName);
		System.out.println("No of Districts: "+NoofDistricts);
		System.out.println("State Capital: "+StateCapital);
		System.out.println("State Bird: "+StateBird);
		System.out.println("************");
	}
}

class District
{
	String DistrictName;
	int NoofTalluk;
	int NoofMLASeats;
	int NoofMPSeats;
	District(String dn,int tq,int mla,int mp)
	{
		DistrictName=dn;
		NoofTalluk=tq;
		NoofMLASeats=mla;
		NoofMPSeats=mp;
		System.out.println("District Name: "+DistrictName);
		System.out.println("no of Talluk: "+NoofTalluk);
		System.out.println("No of MLASeats: "+NoofMLASeats);
		System.out.println("No of MP Seats: "+NoofMPSeats);
	}
}

public class Program6PC {

	public static void main(String[] args) {
		Country i=new Country("India",28,8,"Tiger");
		
		
		
		State k=new State("Karnataka",31,"Bangalore","Indian Roller");
		
		
		
		District b=new District("Bijapur",5,7,1);
		
	}

}
