import java.util.Scanner;

public class FiveAverage {

	public static void main(String[] args) {
		System.out.println("This program will find the average of up to 5 numbers");

		Scanner input = new Scanner(System.in);

		int count, total, runningCount;

		System.out.print("Please choose amount of numbers to average (0-5): ");
		count = input.nextInt();

		runningCount = count;
		total = 0;

		/* If statements check if the running count is within range 0-5. 
		   If true, it'll add the input num to total, and the running count decrements from 
		   whatever the user initally chose for amount of numbers to average */
		
		if (runningCount == 5) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			int num = input.nextInt();
			total = total + num;
			runningCount--;
		}

		if (runningCount == 4) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			runningCount--;
		}

		if (runningCount == 3) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			runningCount--;
		}

		if (runningCount == 2) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			runningCount--;
		}

		if (runningCount == 1) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			runningCount--;
		}
		
		//Checks to see if user had 1 input or more, if not, the program will end
		if (count > 0)
			System.out.println("Average is " + ((double)total/count));
		else
			System.out.println("There are no numbers to average.");
	

	}
}
