import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numerator;
		int denominator;

		System.out.println("This program divides two numbers.");
		System.out.print("Enter the numerator: ");
		numerator = keyboard.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = keyboard.nextInt();
		
		//Checks to see if there's a divide by zero 
		if(denominator == 0) {
			System.out.println("Dividing by zero!");
		}
		//Dvidies the two numbers from the user and outputs it as a double. Int is up cast to a double
		else {
		System.out.println(numerator + "/" + denominator + " = " + (double) (numerator/denominator));

	}
	}

}
