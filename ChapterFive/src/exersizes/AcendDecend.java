package exersizes;
import java.util.Scanner;
public class AcendDecend {

	public static void main(String[] args) 
	{
        int num1;
        int num2;
        int num3;
        String result = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        num1 = input.nextInt();
        System.out.println("please input another number");
        num2 = input.nextInt();
        System.out.println("Please input another number");
        num3 = input.nextInt();
        if(num1 <= num2 && num1 <= num3)
        {
        	if(num2 <= num3) 
        	{
        		result = num1 + " " + num2 + " " + num3;
        	}
        	else if(num3 <= num2)
        	{
        		result = num1 + " " + num3 + " " + num2;
        	}
        }
        else if(num2 <= num1 && num2 <= num3)
        {
            if(num1 <= num3)
            {
            	result = num2 + " " + num1 + " " + num3;
            }
            else if(num3 <= num1)
            {
            	result = num2 + " " + num3 + " " + num1;
            }
        }
        else if(num3 <= num1 && num3 <= num2)
        {
        	if(num1 <= num2)
        	{
        		result = num3 + " " + num1 + " " + num2;
        	}
        	else if(num2 <= num1)
        	{
        		result = num3 + " " + num2 + " " + num1;
        	}
        }
        
        System.out.println(result);
	}

}
