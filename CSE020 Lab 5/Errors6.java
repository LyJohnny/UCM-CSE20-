import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter the first number: ");
		n1 = input.nextInt();

		System.out.print("Please enter the second number: ");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.print("The average of the numbers is " + average + "\n");
		
		//float n1, n2; wrong statement
		float n3, n4; //changed the name of the float variables to n3 and n4 since n1 and n2 are already assigned with the int variable

		System.out.print("\nPlease enter the first number:");
		//n1 = input.nextFloat(); wrong statement
		n3 = input.nextFloat(); //changed n1 to n3 since it corresponds with the float variable 

		System.out.print("Please enter the second number: ");
		//n2 = input.nextFloat(); wrong statement
		n4 = input.nextFloat(); //changed n2 to n4 since it corresponds with the float variable 

		//float average; wrong statement
		float floatAverage; //the variable name average is already taken by the int variable so we have to change it to another name
		
		//average = (n1+n2)/2; wrong statement
		floatAverage = (float)(n3+n4)/2; //we have to change the variable name to the appropriate one and assign it with the average of float using a explicit type conversion , thus we use the variables n3 and n4
		
		//System.out.print("The average of the numbers is " + average); wrong statement
		System.out.print("The average of the numbers is " + floatAverage + "\n"); //we want the print statement to print out the floatAverage variable we made and not the int average variable

		short s1, s2; //wrong statement
		//int s1, s2; //we can't down convert a short variable to an int so we have to use int variables instead
		
		System.out.print("\nPlease enter the first number: ");
		s1 = input.nextShort();

		System.out.print("Please enter the second number: ");
		s2 = input.nextShort();
		
		short shortAvg; //wrong statement
		//int shortAvg; //we have to use an int variable instead of short because we can't up convert a short variable to int
		
		//shortAvg = (short)(n1+n2)/2; wrong statement
		shortAvg = (short)((s1+s2)/2); //we have to change the variables here to s1 and s2 since they correspond with the int variable we're trying to down convert
		System.out.print("\nThe average of the numbers is " + shortAvg + "\n");
	}

}
