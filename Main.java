import java.util.Scanner;


public class Main{
	public static Scanner sc ;
	public static void main(String [] args){
		System.out.println("Hello World");
		System.out.println("Enter Distance Fredy has to jump(in meter): ");
		sc = new Scanner(System.in);
		
		double distance = positivityValidation(validatedDoubleValue(sc));
		FreddyJump j = new FreddyJump();
		System.out.println("Freddy wants "+ j.calculation(distance)[0] + " Seconds to end ");
		System.out.println("Freddy Jumps "+ j.calculation(distance)[1]+ " times");
		
	}

	public static double validatedDoubleValue(Scanner sc){
		
		 
		boolean dec ; 
		double doubleValue = 0.0;
		
		do {      
			String input = sc.nextLine();
			try 
				{ 
					doubleValue = Double.parseDouble(input); 
					dec = false;
				}  
			catch (NumberFormatException e)  
				{ 
					System.out.println(input + " is not a valid Number, Please enter a Number : "); 
					dec = true;
				}
		}
		while (dec);
		return doubleValue;
	}

	public static double positivityValidation(double number){
		while (number < 0){
			if (number < 0){
				System.out.println("Enter a positive number");
				number = validatedDoubleValue(sc);

				
			}
		}

		return number;
	}

 
}