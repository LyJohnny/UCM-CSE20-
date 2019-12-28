import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) { 
		int weight, age; //moved declaration of int variable to be before the print statement
		Scanner keyboard = new Scanner(System.in); //moved the scanner to top

		System.out.print("What is your weight in kg? " );
		weight = keyboard.nextInt();

		//Scanner keyboard;  this line is unnecessary as it doesn't do anything and it's not set up correctly
		

		System.out.print("What is your age? ");
		age = keyboard.nextInt();

		System.out.println("Wow! You are " + (int) (age*6.9) + " in dog years.");
		//System.out.println("Your weight in lbs is " + (int) weight * 2.2 + " with no decimal point"); wrong statement
		System.out.println("Your weight in lbs is " + (int)(weight * 2.2) + " with no decimal point"); //the operation of weight*2.2 should be in parentheses
	}

}