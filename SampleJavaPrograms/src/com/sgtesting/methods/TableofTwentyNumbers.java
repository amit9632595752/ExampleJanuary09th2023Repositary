  package com.sgtesting.methods;
class TableFirstTwenty
{
	void TableofTwentyNumbers()
	{
		
		int res;
		for(int j=1;j<=20;j++)
		
		{
			for(int i=1;i<=10;i++)
			
			{
				res=(j*i);
				System.out.println(j+" * "+i+" = "  +res);	
				    
			}
			System.out.println("****************");
			System.out.println();
		}
		
	}
	
}

public class TableofTwentyNumbers {

	public static void main(String[] args) {
		TableFirstTwenty a= new TableFirstTwenty();
		a.TableofTwentyNumbers();
	}

}
