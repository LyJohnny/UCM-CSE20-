import java.util.Scanner;
public class PosAverage {

	public static void main(String[] args) {
		Scanner inputN = new Scanner(System.in);
		System.out.println("Enter 0 or less to stop entering numbers");
		int num;
		int i = 1;
		double total = 0.0;
		do {
			System.out.println("Enter value #" + i + ":");
			num = inputN.nextInt();
			
			total += num;
			i++;
			
		} while (num > 0);
		if(num <=0 && total <=0) {
			System.out.println("No positive numbers were input");

		}
		else {	
		total = total - num;
		System.out.println("\nAverage is " + (double)(total/(i-2)));
		
		}
	
	
	}
}

