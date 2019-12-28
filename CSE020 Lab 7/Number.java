import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 1-26: ");
		double num = input.nextInt();
		
		System.out.println("You have entered " + (int)(num));
		
		if(num >=1 && num <=26) {
			System.out.println("Character " + (int)(num) + " of the alphabet is " + (char)(64+(num)));
		}
		else {
			System.out.println("Invalid Input! Number is outside of acceptable range.");
		}
	}

}
