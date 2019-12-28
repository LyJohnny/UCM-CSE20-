import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		System.out.println("This program will find the sum of all numbers till a specified maximum.");
		Scanner inputN = new Scanner(System.in);
		int numMax;
		System.out.println("\nPlease enter the max amount of numbers to add: ");
		numMax = inputN.nextInt();
		int currentCount;
		int total = 0;
		
		for(currentCount = 0; currentCount <= numMax; currentCount++) {
			System.out.println("Number " + currentCount);
			total += currentCount;
		}
		System.out.println("The sum of all numbers from 0 till " + numMax + " is " + total);

	}

}
