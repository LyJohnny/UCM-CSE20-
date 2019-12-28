import java.util.Scanner;

public class MultiplesFor {

	public static void main(String[] args) {
		System.out.println("This program prints out multiples of a base number till a specified maximum.");
		Scanner inputN = new Scanner(System.in);
		int maximumNum;
		System.out.println("\nPlease enter the maximum number: ");
		maximumNum = inputN.nextInt();
		int numMult;
		System.out.println("Please enter the base number whose multiples to print: ");
		numMult = inputN.nextInt();
		
		System.out.println("\nMultiples of " + numMult + " from 1 till " + maximumNum + " are: ");
		
		int currentCount;
		/*Outputs the multiples of numMult till the maximum user input from maximumNum. 
		Ex: Multiples of 3 till max number of 9 */
		for(currentCount = 1; currentCount< maximumNum; currentCount++) {
			if(currentCount % numMult == 0)
			System.out.println("Number " + currentCount);
	}

}
}
