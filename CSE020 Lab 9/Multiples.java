import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		System.out.println("This program prints out multiples of a given number till a specified maximum.");
		Scanner inputN = new Scanner(System.in);
		int maximumNum;
		System.out.println("\nPlease enter the maximum number: ");
		maximumNum = inputN.nextInt();
		int numMult;
		System.out.println("Please enter the number whose multiplies to print: ");
		numMult = inputN.nextInt();
		
		System.out.println("\nMultiples of " + numMult + " from 1 till " + maximumNum + " are: ");
		
		int currentCount = 1;
		while(currentCount < maximumNum) {
			if(currentCount % numMult == 0)
			System.out.println("Number " + currentCount);
			currentCount++;
		}
		
		
		
	}

}
