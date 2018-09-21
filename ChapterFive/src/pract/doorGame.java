package pract;
import java.util.Scanner;
public class doorGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int doorChoice;
        int chestChoice;
        int bookChoice;
        String result = null;
        Scanner input = new Scanner(System.in); 
        System.out.println("welcome to the amazing door game!");
        System.out.println("Your host Steave Harvey!!");
        System.out.println("Pick a door any door. \n1- for door 1 \n2- for door 2 \n3- for door three");
        doorChoice = input.nextInt();
        
        if (doorChoice == 1)
        {
        	
        	System.out.println("door one, good choice, now pick a chest");
        	System.out.println("1 for chest \n1 2 for chest \n2");
        	chestChoice = input.nextInt();
        	if(chestChoice == 1) 
        	{
        		result = " You got a pile of gold";
        	}
        	else if(chestChoice == 2) 
        	{
        		result = " You got nothing";
        	}
        	else  
        	{
        	result =  "I said \n1 or \n2 I guess you lose, Ha";	
        	}
        	
             
        }
        
        else if(doorChoice == 2) 
        {
        	result = " A donkey and it Speakes!" + "Donkey: I'm a donkey";
        }
        
        else if(doorChoice == 3)
        {
        	result = " A waste of time waiting as the third person in a line that has a clumsy cashier";
        }
        
        else if(doorChoice == 4) 
        {
        	result = " nothing because that was not a choice";	
        }
	
	else if(doorChoice == 999)
	{
		System.out.println("You enter a special room with three book that have no title, do you pick number one two or three");
		bookChoice = input .nextInt();
		if(bookChoice == 1) 
		{
			result = "You pick up the book and open it, it choots out a bright light at you, when you wake up you find yourself "
					+ "in a new place, the sky is purple and the grass is black, you have no idea what you've gotten into";
		}
		else if(bookChoice == 2) 
		{
			result = "You open the book, it has a hole with a bottle and a green liquid, you drink it, "
					+ "suddenly you transform into a giant fire breathing dragon";
		}
		else if(bookChoice == 3) 
		{
		result = "You open the book, it has strange symbols, you take it home and study it eventually descovering the symbols"
				+ " are spells, after learning this you become the most powerful being on the planet taking over with "
				+ "the power of the book";	
		}
		else
		{
			result = "You pick up all the books and stack them, a bright light shines as you gain knowledge of everything"
					+ " you become the wisest and smartest person to have ever lived, you know everything";
		}
	}
		
		displayMessage(result);
	}
	public static void displayMessage(String result) 
	{
		
		System.out.println(result);
	}
}
