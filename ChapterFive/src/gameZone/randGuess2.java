package gameZone;

import java.util.Scanner;
public class randGuess2 {

	public static void main(String[] args) 
	{
        int usersGuess = 0;
        int compSecret;
        
        String result = null;
        compSecret = (int)(Math.random() * 10 + 1);
        
        Scanner input = new Scanner(System.in);
        do {
        System.out.println("Pick a number between one and ten");
        usersGuess = input.nextInt();
        
        if(usersGuess < compSecret)
        {
        	result = "Higher";
        }
        else if(usersGuess > compSecret)
        {
        	result = "Lower";
        }
        else if(usersGuess == compSecret)
        {
        	result = "Thats Correct! You Win!";
        }
        
        randomNumber(result);
        }while(usersGuess != compSecret);  
	}
public static void randomNumber(String result)
{
	System.out.println(result);
}
}
