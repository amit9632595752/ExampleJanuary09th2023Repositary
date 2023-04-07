package com.sgtesting.NoargsConstructor;

class Customer
{
	String CustomerName;
	int CustomerID;
	String Location;
	Customer()
	{
		CustomerName="Akshay";
		CustomerID=15175;
		Location="Bangalore";
		System.out.println(CustomerName);
		System.out.println(CustomerID);
		System.out.println(Location);
		System.out.println("*********");
	}
	
}

class Product 
{
	String ProductName;
	String ProductType;
	int mfgNumber;
	String mfgDate;
	Product()
	{
		ProductName="Dell Laptop";
		ProductType="Electronics";
		mfgNumber=432685;
		mfgDate="23-JUNE-2019";
		System.out.println(ProductName);
		System.out.println(ProductType);
		System.out.println(mfgNumber);
		System.out.println(mfgDate);
		System.out.println("********");
	}
}

class Order
{
	String OrderedThing;
	int OrderNumber;
	String OrderedDate;
	Order()
	{
		OrderedThing="Dell Laptop";
		OrderNumber=241798;
		OrderedDate="10-JULY-2020";
		System.out.println(OrderedThing);
		System.out.println(OrderNumber);
		System.out.println(OrderedDate);
	}
}
public class Program3Noargs {

	public static void main(String[] args) {
		Customer c=new Customer();
		
		
		Product p=new Product();
		
		
		Order o=new Order();
		
		
	}

}
