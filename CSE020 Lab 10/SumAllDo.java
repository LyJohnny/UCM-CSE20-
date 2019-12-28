import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		System.out.println("This program will find the sum of all numbers till a specified maximum.");
		Scanner inputN = new Scanner(System.in);
		int numMax;
		System.out.println("\nPlease enter the max amount of numbers to add: ");
		numMax = inputN.nextInt();
		
		int currentCount = 0;
		int total = 0;
		
		do {
			System.out.println("Number " + currentCount);
			total += currentCount;
			currentCount++;
		}
		while(currentCount <= numMax);
		System.out.println("The sum of all numbers from 0 till " + numMax + " is " + total);

	}

}
