import java.util.Scanner;
public class Errors1 {
	public static void main(String[] args)
	{
	//public static void main(String[] args) Required a bracket because thats where the main statement is stored
		
		System.out.println("Can you spot and fix the errors?");
		//System.out.println("Can you spot and fix the errors?'); This needs end double quotes
				
		System.out.println("Enter two numbers and I will ");
		System.out.println("add them for you");

		int n1, n2;
		Scanner keyboard = new Scanner(System.in);
		//Scanner keyboard = new Scanner(System.in) Needed import java.util.Scanner at the top and a semicolon at the end of this line
		
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		//n1 = nextInt(); For the scanner object to get input, it needs to be the objects name.input so like keyboard.nextInt()
		//n2 = nextint();
		
		System.out.println("The sum of the numbers is");
		//System.println("The sum of the numbers is"); The print statement needs to be System.out because it's an output
		System.out.println(n1 + n2);
		//System.out.println(n1 - n2); Logistic error. It's asking for the sum so the operator should be + not -
	}
} 
