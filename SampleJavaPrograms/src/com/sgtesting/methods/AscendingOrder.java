
package com.sgtesting.methods;
class Ascending
{
	void AscendingSort(int a[])
	{
		int temp=0;

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]+"  ");
		}
	}
}
public class AscendingOrder {

	public static void main(String[] args) {
		Ascending o1=new Ascending();
		int a[]= {4,5,6,7,2,9,1,8,3};
		o1.AscendingSort(a);

	}
}
