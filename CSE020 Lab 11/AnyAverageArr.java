import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner numAvg = new Scanner(System.in);
		int numAverage;
		System.out.println("This program will find the average of any set of numbers.");
		System.out.println("\nPlease choose number of values to average:");
		numAverage = numAvg.nextInt();
		if (numAverage ==0) {
			System.out.println("No numbers to average. Exiting program.");
		}
		else {
		Scanner colW = new Scanner(System.in);
		int columnWidth;
		System.out.println("Please choose column width for output formatting:");
		columnWidth = colW.nextInt();
		
		int[] arr1 = new int[numAverage+1];
		int i = 1;
		double result = 0.0;
		
		Scanner input = new Scanner(System.in);
		int value;
		
		for (i = 1; i <= numAverage; i++) {
			System.out.println("Please enter the value #" + i +": ");
			value = input.nextInt();
			arr1[i] = value;
			result+= arr1[i];

		
	}
	System.out.println("\nThe numbers being averaged are ...");
		for (i = 1; i <= numAverage; i++) {
			if (i % columnWidth == 1) {
				System.out.println();
				System.out.print(arr1[i]+ " ");


			}
			
			else {
				System.out.print(arr1[i]+ " ");
			}
		}
		System.out.println("\nAverage is: " + (double)result/numAverage);

	}
}

}