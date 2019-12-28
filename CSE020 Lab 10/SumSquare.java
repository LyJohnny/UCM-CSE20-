import java.util.Scanner;
public class SumSquare {

	public static void main(String[] args) {
		int max;
		Scanner inputN = new Scanner(System.in);
		System.out.println("Please enter the maximum number: ");
		max = inputN.nextInt();
		int total = 0;
		//Outputs the square of a number and increments it till the maximum count which is the user input
		for(int i = 1; i <= max; i++) {
			System.out.println("Number " + i + " squared is " + (i*i));
			 total += i*i;
		}
		//Calculates the total of numbers squared altogether
		System.out.println("\nThe sum of squares of all numbers from " + (max- (max-1)) + " till " + max + " is: " + total);
	}

}
