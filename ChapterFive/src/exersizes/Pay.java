package exersizes;
import java.util.Scanner;

public class Pay {
	public static void main(String[] args) 
	{
		int skillLevel;
		int option;
		double hoursWorked;
		double pay;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your skill level");
		skillLevel = input.nextInt();
		System.out.println("Please input your hours worked");
		hoursWorked = input.nextInt();
		if(skillLevel == 1)
		{
			option = 0;
			pay = 17;
			displayPay();
			
		}
	}
public static void displayPay()
{
	
}

}
