package com.sgtesting.NoargsConstructor;

class  Fruits
{
	String FruitName;
	String FruitColor;
	int NoofFruits;
	String TasteofFruit;
	Fruits()
	{
		FruitName="Mango";
		FruitColor="Yellow";
		NoofFruits=12;
		TasteofFruit="Sweet";
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
	Flowers()
	{
		FlowerName="Rose";
		FlowerColor="Red";
		NoofFlowers=150;
		FlowerWeight=2;
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
	Vegetables()
	{
		VegetableName="Tomato";
		VegetableColor="Red";
		NoofVegetabale=20;
		VegetableWeight=3;
		System.out.println(VegetableName);
		System.out.println(VegetableColor);
		System.out.println(NoofVegetabale);
		System.out.println(VegetableWeight);
	}
}

public class Program2Noargs {

	public static void main(String[] args) {
		Fruits f=new Fruits();
		
		
		Flowers a=new Flowers();
		
		
		Vegetables v=new Vegetables();
		
		
		
		


	}

}
