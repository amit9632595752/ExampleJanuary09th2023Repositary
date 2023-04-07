package com.sgtesting.parameterisedconstructor;

class  Fruits
{
	String FruitName;
	String FruitColor;
	int NoofFruits;
	String TasteofFruit;
	Fruits(String fn,String fc,int nf,String tf)
	{
		FruitName=fn;
		FruitColor=fc;
		NoofFruits=nf;
		TasteofFruit=tf;
		System.out.println(FruitName);
		System.out.println(FruitColor);
		System.out.println(NoofFruits);
		System.out.println(TasteofFruit);
		System.out.println("**********");
	}
}

class Flowers
{
	String FlowerName;
	String FlowerColor;
	int NoofFlowers;
	int FlowerWeight;
	Flowers(String fln,String flc,int fno,int flw)
	{	
		FlowerName=fln;
		FlowerColor=flc;
		NoofFlowers=fno;
		FlowerWeight=flw;
		System.out.println(FlowerName);
		System.out.println(FlowerColor);
		System.out.println(NoofFlowers);
		System.out.println(FlowerWeight);
		System.out.println("********");
	}
}

class Vegetables
{
	String VegetableName;
	String VegetableColor;
	int NoofVegetabale;
	int VegetableWeight;
	Vegetables(String vn,String vc,int nv,int vw)
	{
		VegetableName=vn;
		VegetableColor=vc;
		NoofVegetabale=nv;
		VegetableWeight=vw;
		System.out.println(VegetableName);
		System.out.println(VegetableColor);
		System.out.println(NoofVegetabale);
		System.out.println(VegetableWeight);
	}
}

public class Program2PC {

	public static void main(String[] args) {
		Fruits f=new Fruits("Mango","Yellow",12,"Sweet");
		
		
		Flowers a=new Flowers("Rose","Red",150,2);
		
		
		Vegetables v=new Vegetables("Tomato","Red",20,3);

	}

}

