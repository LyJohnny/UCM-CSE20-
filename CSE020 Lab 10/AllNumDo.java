import java.util.Scanner;

public class AllNumDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		int i = 0;
		//do while loop that outputs numbers up to the max number from user input
		do {
			System.out.println("Number " + i);
			i++;
		} while ( i <= max);
	}
}
