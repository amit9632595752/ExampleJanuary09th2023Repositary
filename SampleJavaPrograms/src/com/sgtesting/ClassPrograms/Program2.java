package com.sgtesting.ClassPrograms;
class  Fruits
{
	String FruitName;
	String FruitColor;
	int NoofFruits;
	String TasteofFruit;
}

class Flowers
{
	String FlowerName;
	String FlowerColor;
	int NoofFlowers;
	int FlowerWeight;
}

class Vegetables
{
	String VegetableName;
	String VegetableColor;
	int NoofVegetabale;
	int VegetableWeight;
}

public class Program2 {

	public static void main(String[] args) {
		Fruits f=new Fruits();
		f.FruitName="Mango";
		f.FruitColor="Yellow";
		f.NoofFruits=12;
		f.TasteofFruit="Sweet";
		System.out.println(f.FruitName);
		System.out.println(f.FruitColor);
		System.out.println(f.NoofFruits);
		System.out.println(f.TasteofFruit);
		System.out.println("**********");
		
		Flowers a=new Flowers();
		a.FlowerName="Rose";
		a.FlowerColor="Red";
		a.NoofFlowers=150;
		a.FlowerWeight=2;
		System.out.println(a.FlowerName);
		System.out.println(a.FlowerColor);
		System.out.println(a.NoofFlowers);
		System.out.println(a.FlowerWeight);
		System.out.println("********");
		
		Vegetables v=new Vegetables();
		v.VegetableName="Tomato";
		v.VegetableColor="Red";
		v.NoofVegetabale=20;
		v.VegetableWeight=3;
		System.out.println(v.VegetableName);
		System.out.println(v.VegetableColor);
		System.out.println(v.NoofVegetabale);
		System.out.println(v.VegetableWeight);
		
		
		


	}

}
