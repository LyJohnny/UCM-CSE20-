import java.util.Scanner;
public class Errors3 {
//public class Errors3  missing bracket and end bracket for the main statement to be within the class

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		//Scanner kbd = new Scanner System.in; syntax is wrong, System.in is the input that the scanner uses so it's in parentheses 
		int numerator;
		//Int numerator; int shouldn't be capitalized
		int denominator;
		//integer denominator; we don't spell out the int variable 

		System.out.println("This program divides two numbers.");
		//System.println("This program divides two numbers."); print statement needs to be specified to be an output so include System.out
		System.out.print("Enter the numerator: ");
		//System.print("Enter the numerator: "); Again, needs to be specified to be an output for print statement
		numerator = kbd.nextInt();
		//numerator = kbd.nextInt(); typo on the variable numberator. It should be corrected to numerator 
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt();
		//denomintaor = kbd.nextInt(); typo on denominator, should be corrected to denominator

		System.out.print(numerator);
		//system.out.print(numerator); System should be capitalized
		System.out.print("/");
		System.out.print(denominator);
		//system.out.Print(denominator); System should be capitalized and print should be lower cased
		System.out.print(" = ");
		System.out.println((double) numerator/denominator);
		//System.out.Println((double) numerator/denominator); Println should be lower cased
	}
} 
