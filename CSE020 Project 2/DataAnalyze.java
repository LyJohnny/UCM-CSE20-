import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the sample size: ");
		System.out.println();
		int sampleSize = input.nextInt();

		//checks to see if user inputs 0 for sample size
		if (sampleSize == 0) {
			System.out.println("No Data to Analyze. Ending Program.");
		}
		else {

			//numData is the amount of trials for each sample
			int numData = 4;
			int i = 0;
			int b = 0;

			//three arrays created to store data from user input, store it to total, and finding average
			int[] data = new int[sampleSize * numData];
			int[] total = new int[numData];
			int[] average = new int [numData];



			//entering numbers for trial
			for (i=0;i <numData;++i) {
				System.out.println("Enter numbers for Trial " + i);

				//entering sample numbers

				for (b=1;b<sampleSize+1;++b) {
					System.out.print("Enter sample # " + b + ":");
					System.out.print("\n");
					/*Store the user input for sample numbers into the data at index i and 
			the total is data at index i plus one */
					data[i] = input.nextInt();
					total[i] += data[i];
				}

			}

			//calculating average
			for(i = 0; i <numData; ++i) 
				average [i] = total [i] / sampleSize;

			double min = average [0];
			double max = average [0];

			for (i=0; i <numData; ++i) {
				if (average[i] < min)
					min = average [i];
				if (average[i] > max)
					max = average [i];

			}

			System.out.println("\tSample # \tTrial 1 \tTrial 2 \tTrial 3 \tTrial 4");
			for (b=1; b < sampleSize+1; ++b) {
				System.out.print("\t" + b + "\t");
				/*this prints the sample numbers by accessing the array data at index i which is where 
			the user inputs the sample numbers */
				for (i=0; i < numData; i++) {
					System.out.print("\t" + data[i] + "\t");

				}
				System.out.println();
			}
			System.out.println("\t-----------------------------------------------------------------------");
			System.out.print("Averages: \t");

			//prints the averages stored in the array at index i as a double, all on one line	
			for (i=0; i<numData; i++) {
				System.out.print("\t" + (double)average[i] + "\t" );
			}
			System.out.println();
			System.out.println("\nMin Average " + ": " + min);
			System.out.println("Max Average " + ": " + max);
			System.out.println("\n");


			//checks if trials match or concur with each other
			if (min == max)
				System.out.println("The trials match EXACTLY!");
			else if (max < min*2.0)
				System.out.println("The trials concur with each other!");
			else 
				System.out.println("The trials do NOT concur!");
		}
	}
}