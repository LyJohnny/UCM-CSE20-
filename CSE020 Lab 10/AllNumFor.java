import java.util.Scanner;

public class AllNumFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		//for loop that outputs numbers till the max number from user input
		for (int i = 0; i <= max; i++) {
			System.out.println("Number " + i);
		}
	}
}
