package com.sgtesting.ClassPrograms;
class TwoWheeler
{
	String TwoWheelerName;
	String TwoWheelerType;
	int Price;
	int MilageinKm;
}

class FourWheeler
{
	String  FourWheelerName;
	String  FourWheelerType;
	int Price;
	int MilageinKm;
}
public class Program4 {

	public static void main(String[] args) {
		TwoWheeler x=new TwoWheeler();
		x.TwoWheelerName="Kawasaki";
		x.TwoWheelerType="Petrol Engine";
		x.Price=400000;
		x.MilageinKm=30;
		System.out.println(x.TwoWheelerName);
		System.out.println(x.TwoWheelerType);
		System.out.println(x.Price);
		System.out.println(x.MilageinKm);
		System.out.println("***************");
		
		FourWheeler y=new FourWheeler();
		y.FourWheelerName="Audi";
		y.FourWheelerType="Petrol Engine";
		y.Price=4000000;
		y.MilageinKm=15;
		System.out.println(y.FourWheelerName);
		System.out.println(y.FourWheelerType);
		System.out.println(y.Price);
		System.out.println(y.MilageinKm);
	

	}

}
