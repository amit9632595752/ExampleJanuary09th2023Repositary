package com.sgtesting.methods;
class TableTen
{
	void TableofTen()
	{
		int res;
		int n=10;
		for(int i=1;i<=10;i++)
	    {
	      res=(n*i);
	      System.out.println(n+" * "+i+" = "  +res);
	    }
	}
}

public class TableofTen {

	public static void main(String[] args) {
		TableTen a=new TableTen();
		a.TableofTen();

	}

}
