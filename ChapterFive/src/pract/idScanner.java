package pract;

import java.util.Scanner;

public class idScanner {

	public static void main(String[] args) 
	{
        int idNumber;
		String result = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Scan bar code to find person");
        idNumber = input.nextInt();
        
        switch(idNumber)
        {
        case 159343:
        	result = "Giovanni Jacobsen";
        	break;
        	
        case 316338:
        	result = "Logan DeWillfond";
        	break;
        case 155706:
        	result = "Joseph Chelupa";
        	break;
        case 274891:
        	result = "Jason Wells";
        	break;
        case 137112:
        	result = "Adam Burtan";
        	break;
        case 137160:
        	result = "Zach Canada";
        	break;
        case 153184:
        	result = "Jayden Graap";
        	break;
        case 129001:
        	result = "Isaac Dibburn";
        	break;
        case 274871:
        	result = "Tavius Sterling";
        	break;
        case 153182:
        	result = "Orion Gardener";
        	break;
        case 274904:
        	result = "Amia Combs";
        	break;
        case 304345:
        	result = "Cheyenne Jones";
        	break;
        case 274894:
        	result = "John Brosuis";
        	break;
        case 118314:
        	result = "Benjamain Brooks";
        	break;
        case 146891:
        	result = "De'Antwan Hanes";
        	break;
        case 146468:
        	result = "Noah Giles";
        	break;
        case 274888:
        	result = "Travis Hodges";
        	break;
        case 315135:
        	result = "Phero Luong";
        default:
        	System.out.println("I have no idea");
        }
        System.out.println(result);
	}

}
