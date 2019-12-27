import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in); 
		int number = 0;
		int theSquare = 0; 
		
		System.out.println("Enter a number and I will");
		//System.out.print("Enter a number and I will") Needs a semicolon at the end and needs to be println so it adds a line after it
		System.out.print("square it for you");
		//System.out.print("square it for you:  ); This is wrong because it doesn't have an end double quote within the parentheses 
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		//number =  keyboard.nextInt; Had to declare the scanner object first on line 14. Then we're able to get the input for number
		int thesquare = number * number;
		// thesquare = number * number; need to assign the variable thesquare with an object, so int because we're using numbers

		System.out.print(number + " squared = ");
		//System.out.print(Number + " squared = "; Needs end parentheses to complete print statement and Number changed to lower case number because that's the input being used
		System.out.println(thesquare);
		//System.out.println(theSquare); This was trying to print the wrong object, I corrected it to thesquare where the number * number
	} 
}
