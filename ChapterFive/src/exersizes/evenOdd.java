package exersizes;
import java.util.Scanner;
public class evenOdd {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please enter a number");
        number = input.nextInt();
        String result;
        if(0 == number%2)
        {
        	result = "even";
        }
        else
        {
        	result = "odd";
        }
        String(result);
	}
public static void String(String result)
{
	System.out.println(result);
}
}
