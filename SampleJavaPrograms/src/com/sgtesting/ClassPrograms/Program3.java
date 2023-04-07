package com.sgtesting.ClassPrograms;
class Customer
{
	String CustomerName;
	int CustomerID;
	String Location;
	
}

class Product 
{
	String ProductName;
	String ProductType;
	int mfgNumber;
	String mfgDate;
}

class Order
{
	String OrderedThing;
	int OrderNumber;
	String OrderedDate;
}
public class Program3 {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.CustomerName="Akshay";
		c.CustomerID=15175;
		c.Location="Bangalore";
		System.out.println(c.CustomerName);
		System.out.println(c.CustomerID);
		System.out.println(c.Location);
		System.out.println("*********");
		
		Product p=new Product();
		p.ProductName="Dell Laptop";
		p.ProductType="Electronics";
		p.mfgNumber=432685;
		p.mfgDate="23-JUNE-2019";
		System.out.println(p.ProductName);
		System.out.println(p.ProductType);
		System.out.println(p.mfgNumber);
		System.out.println(p.mfgDate);
		System.out.println("********");
		
		Order o=new Order();
		o.OrderedThing="Dell Laptop";
		o.OrderNumber=241798;
		o.OrderedDate="10-JULY-2020";
		
	}

}
