package com.sgtesting.parameterisedconstructor;

class TwoWheeler
{
	String TwoWheelerName;
	String TwoWheelerType;
	int Price;
	int MilageinKm;
	TwoWheeler(String tn,String twt,int pr,int mil)
	{
		TwoWheelerName=tn;
		TwoWheelerType=twt;
		Price=pr;
		MilageinKm=mil;
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
	FourWheeler(String fn,String ft,int pri,int milage)
	{
	FourWheelerName=fn;
	FourWheelerType=ft;
	Price=pri;
	MilageinKm=milage;
	System.out.println(FourWheelerName);
	System.out.println(FourWheelerType);
	System.out.println(Price);
	System.out.println(MilageinKm);
	}
	
}
public class Program4PC {

	public static void main(String[] args) {
		TwoWheeler x=new TwoWheeler("Kawasaki","Petrol Engine",400000,30);
		
		
		FourWheeler y=new FourWheeler("Audi","Petrol Engine",4000000,15);
		
	}

}
