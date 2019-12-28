import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		System.out.println("This program will find the average of as many numbers as you like.");
		Scanner inputA = new Scanner(System.in);
		int numAmt;
		
		//Asks how many values the user wants to average
		
		System.out.println("\nPlease choose the number of values to average: ");
		numAmt = inputA.nextInt();
		int currentCount = 0;
		int num = 1;
		int numToAdd = 0;
		int total = 0;
		Scanner inputB = new Scanner(System.in);
		
		/*This asks the user for each input and increments the currentCount till 
		it reaches the maximum numAmt the user initially put. */
		
		while(currentCount < numAmt) {
			System.out.println("Please enter the " + num + " number: ");
			num++;
			numToAdd = inputB.nextInt();
			total += numToAdd;
			currentCount++;
			
		}
		//Calculates average
		if (numAmt > 0) {
			System.out.println("The average of all the numbers is: " + (double)(total/numAmt));
		}
		//If user inputs zero, the program will end
			else if (numAmt == 0) {
				System.out.println("The average of all the numbers is 0.0" );
			}
		}
}


