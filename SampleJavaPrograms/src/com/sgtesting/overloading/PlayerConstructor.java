package com.sgtesting.overloading;
class Player
{
	Player(String playerName,String pstatus)
	{
		System.out.println("Player Name:"+playerName);
		System.out.println("Player Status:"+pstatus);
	}
	Player(int age, int runs)
	{
		System.out.println("Player Age:"+age);
		System.out.println("Player Runs:"+runs);
	}
	Player(int strikerate,double average)
	{
		System.out.println("Player Strikerate:"+strikerate);
		System.out.println("Player Average:"+ average);
	}
	Player(int noofcentury,String pnation)
	{
		System.out.println("Number of Century:"+noofcentury);
		System.out.println("Player Nation:"+pnation);
	}
	Player(int nooffifty)
	{
		System.out.println("Number of Fifty:"+nooffifty); 
	}
}

public class PlayerConstructor {

	public static void main(String[] args) {
		Player a=new Player("Virat Kohli","Batsman");
		Player b=new Player(34,1760);
		Player c=new Player(154,56.55);
		Player d=new Player(74,"India");
		Player e=new Player(87);
		
	

	}

}
