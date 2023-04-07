package com.sgtesting.NoargsConstructor;

class TwoWheeler
{
	String TwoWheelerName;
	String TwoWheelerType;
	int Price;
	int MilageinKm;
	TwoWheeler()
	{
		TwoWheelerName="Kawasaki";
		TwoWheelerType="Petrol Engine";
		Price=400000;
		MilageinKm=30;
		System.out.println(TwoWheelerName);
		System.out.println(TwoWheelerType);
		System.out.println(Price);
		System.out.println(MilageinKm);
		System.out.println("***************");	
	}
}

class FourWheeler
{
	String  FourWheelerName;
	String  FourWheelerType;
	int Price;
	int MilageinKm;
	FourWheeler()
	{
		FourWheelerName="Audi";
		FourWheelerType="Petrol Engine";
		Price=4000000;
		MilageinKm=15;
		System.out.println(FourWheelerName);
		System.out.println(FourWheelerType);
		System.out.println(Price);
		System.out.println(MilageinKm);
	}
}
public class Program4Noargs {

	public static void main(String[] args) {
		TwoWheeler x=new TwoWheeler();
		
		
		FourWheeler y=new FourWheeler();
		
	

	}

}

