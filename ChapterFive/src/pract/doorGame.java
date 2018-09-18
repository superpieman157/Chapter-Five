package pract;
import java.util.Scanner;
public class doorGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int doorChoice;
        String result = null;
        Scanner input = new Scanner(System.in); 
        System.out.println("welcome to the amazing door game!");
        System.out.println("Your host Steave Harvey!!");
        System.out.println("Pick a door any door. \n1- for door 1 \n2- for door 2 \n3- for door three");
        doorChoice = input.nextInt();
        
        if (doorChoice == 1)
        {
        	result = " a pile of gold";
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
		
		displayMessage(result);
	}
	public static void displayMessage(String result) 
	{
		
		System.out.println("You won" + result);
	}
}
