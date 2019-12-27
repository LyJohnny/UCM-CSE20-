import java.util.Scanner;
public class Interviewer {

	public static void main(String[] args) {
		
		Scanner Name = new Scanner(System.in);
		String name;
		System.out.println("What is your name?");
		name = Name.next();
		
		Scanner Major = new Scanner(System.in);
		String major;
		System.out.println("What is your major?");
		major = Major.nextLine();
		
		Scanner Home = new Scanner(System.in);
		String hometown;
		System.out.println("Where is your hometown?");
		hometown = Home.nextLine();
		
		Scanner Food = new Scanner(System.in);
		String food;
		System.out.println("What is your favorite food?");
		food = Food.next();
		
		Scanner keyboard = new Scanner(System.in);
		int year;
		System.out.println("How many year(s) have you been at UC Merced?");
		year = keyboard.nextInt();
		
		Scanner Height = new Scanner(System.in);
		Float height;
		System.out.println("What is your height in inches?");
		height = Height.nextFloat();
		System.out.print("So your name is " + name +". ");
		System.out.print("Your major is " + major + " ");
		System.out.print("and you are a year ");
		System.out.print(year + " student.");
		System.out.println("Your hometown is " + hometown +" ");
		System.out.print("and your favorite food is " + food +". ");
		System.out.println("Your height in centimeters is " +(float)(height*2.54));
		
		
		
		
		

	}

}
