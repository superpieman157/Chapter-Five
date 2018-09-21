package exersizes;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) 
	{
		int userChoice;
		String result = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please pick what condo you want 1 for park view 2 for golf course view and 3 for lake view"
				+ " 1 costs 150,000 2 costs 170,000 3 costs 210,000");
		userChoice = input.nextInt();
		
		if(userChoice == 1)
		{
			result = "You have picked 1, the Park view for 150,000";
		}
		else if(userChoice == 2)
		{
			result = "You have picked 2, the golf course view for 170,000";
		}
		else if(userChoice == 3)
		{
			result = "You have picked 3, the lake view for 210,000";
		}
		else
		{
			result = "That is not an option";
		}
		userPick(result);
	}
public static void userPick(String result)
{
	System.out.println(result);
}
}
