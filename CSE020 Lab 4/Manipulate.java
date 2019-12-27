import java.util.Scanner;

public class Manipulate {

	// float is usually smaller than a double. short is smaller than int because there's a certain rangea
	public static void main(String[] args) {
		int n1,n2,n3,n4;
		float n5,n6;
		double n7,n8;
		
		Scanner userNumber = new Scanner(System.in);
		
		
		System.out.println("Please enter two integers:");
		n1 = userNumber.nextInt();
		n2 = userNumber.nextInt();
		
		
		System.out.println("The sum of " + n1 + " and " + n2 + " is " +(int)(n1+n2));
		System.out.println("The difference of " + n1 + " and " + n2 + " is " +(int)(n1-n2));
		System.out.println("The product of " + n1 + " and " + n2 + " is " +(int)(n1*n2));
		System.out.println("The Integer Cast of " + "(" + n1 + " / " + n2 + ")" + " is " +(int)(n1/n2));
		System.out.println("The Integer Cast of " + "(" + n1 + " % " + n2 + ")" + " is " +(int)(n1%n2));
		
		System.out.print("\nPlease enter two shorts (-32,768 to 32,767):");
		n3 = userNumber.nextShort();
		n4 = userNumber.nextShort();
		
		System.out.println("The sum of " + n3 + " and " + n4 + " is " +(short)(n3+n4));
		System.out.println("The difference of " + n3 + " and " + n4 + " is " +(short)(n3-n4));
		System.out.println("The product of " + n3 + " and " + n4 + " is " +(short)(n3*n4));
		System.out.println("The Short Cast of " + "(" + n3 + " / " + n4 + ")" + " is " +(short)(n3/n4));
		System.out.println("The Short Cast of " + "(" + n3 + " % " + n4 + ")" + " is " +(short)(n3%n4));
		
		System.out.print("\nPlease enter two floating points:");
		n5 = userNumber.nextFloat();
		n6 = userNumber.nextFloat();
		
		System.out.println("The sum of " + n5 + " and " + n6 + " is " +(float)(n5+n6));
		System.out.println("The difference of " + n5 + " and " + n6 + " is " +(float)(n5-n6));
		System.out.println("The product of " + n5 + " and " + n6 + " is " +(float)(n5*n6));
		System.out.println("The Float Cast of " + "(" + n5 + " / " + n6 + ")" + " is " +(float)(n5/n6));
		System.out.println("The Float Cast of " + "(" + n5 + " % " + n6+ ")" + " is " +(float)(n5%n6));
		
		System.out.print("\nPlease enter two doubles:");
		n7 = userNumber.nextDouble();
		n8 = userNumber.nextDouble();
		
		System.out.println("The sum of " + n7 + " and " + n8 + " is " +(double)(n7+n8));
		System.out.println("The difference of " + n7 + " and " + n8 + " is " +(double)(n7-n8));
		System.out.println("The product of " + n7 + " and " + n8 + " is " +(double)(n7*n8));
		System.out.println("The Double Cast of " + "(" + n7 + " / " + n8 + ")" + " is " +(double)(n7/n8));
		System.out.println("The Double Cast of " + "(" + n7 + " % " + n8+ ")" + " is " +(double)(n7%n8));
		
	}

}
