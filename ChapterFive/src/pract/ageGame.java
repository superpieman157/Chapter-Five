package pract;
import java.util.Scanner;
public class ageGame 
{

	public static void main(String[] args) 
	{
		int usersAge;
		Scanner input = new Scanner(System.in);
		String result = null;
		System.out.println("Please input your age and be insulted");
		usersAge = input.nextInt();
		
		if(usersAge <= 12)
		{
			result = "You are a child, Go away";
		}
		
		else if(usersAge >= 13 && usersAge <= 18)
		{
			result = "You unruly JERK";
		}
		
		else if(usersAge >= 19 && usersAge <= 25)
		{
			result = "Get a job you lazy bum";
		}
		else if(usersAge >= 26 && usersAge <= 30)
		{
			result = "You know it all thinking your so smart";
		}
		else if(usersAge >= 31 && usersAge <= 40)
		{
			result = "Wow your old and boring";
		}
		else if(usersAge >= 41 && usersAge <= 50)
		{
			result = "Go back to your failing garden and get some rotting tomatos";
		}
		else if(usersAge >= 51 && usersAge <= 60)
		{
			result = "Why does your house smell so weird";
		}
		else
		{
			result = "Welcome to the last few years of your life, it'll be the worst part yet!";
		}
		displayMessage(result);
	}
public static void displayMessage(String result)
{
	System.out.println(result);
}
}
