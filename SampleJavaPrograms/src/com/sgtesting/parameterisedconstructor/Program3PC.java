package com.sgtesting.parameterisedconstructor;

class Customer
{
	String CustomerName;
	int CustomerID;
	String Location;
	Customer(String cn,int cid,String loc)
	{
		CustomerName=cn;
		CustomerID=cid;
		Location=loc;
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
	Product(String pn,String pt,int mfg,String mfgd)
	{
		ProductName=pn;
		ProductType=pt;
		mfgNumber=mfg;
		mfgDate=mfgd;
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
	Order(String ot,int on,String od)
	{
		OrderedThing=ot;
		OrderNumber=on;
		OrderedDate=od;
		System.out.println(OrderedThing);
		System.out.println(OrderNumber);
		System.out.println(OrderedDate);
	}
}
public class Program3PC {

	public static void main(String[] args) {
		Customer c=new Customer("Akshay",15175,"Bangalore");
		
		
		Product p=new Product("Dell Laptop","Electronics",432685,"23-JUNE-2019");
		
		
		Order o=new Order("Dell Laptop",241798,"10-JULY-2020");

		
	}

}
