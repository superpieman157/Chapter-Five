package gameZone;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
	    String usersGuess = null;
        int compSecret;
        
        String result = null;
        compSecret = (int)(Math.random() * 3 + 1);
        
        Scanner input = new Scanner(System.in);
        do {
        System.out.println("Pick a number between one and ten");
        usersGuess = input.toString();
        
        if(compSecret == 1)
        {
        	String rock;
			if(usersGuess == rock)
			{
				result = "I Also Picked Rock, it's a tie!";
			}
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
