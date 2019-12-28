import java.util.Scanner;
import java.util.Random;

public class BobcatHotel {

	public static void main(String[] args) {
		double singleR = 50.50;
		double doubleR = 75.00;
		double queenR = 100.75;
		double kingR = 150.25;
		double masterSuiteR = 225.50;
		System.out.println("ROOM OPTIONS");
		System.out.println("1. Single @ $50.50 per night");
		System.out.println("2. Double @ $75.00 per night");
		System.out.println("3. Queen @ $100.75 per night");
		System.out.println("4. King @ $150.25 per night");
		System.out.println("5. Master Suite @ $225.50 per night");

		int guest;
		Scanner inputG = new Scanner(System.in);
		System.out.print("\nNumber of guests: ");
		guest = inputG.nextInt();

		double roomChoice;
		Scanner inputR = new Scanner(System.in);
		System.out.print("Please enter your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		roomChoice = inputR.nextDouble();

		int numberOfNights;
		Scanner inputN = new Scanner(System.in);
		System.out.print("Please enter the number of nights: ");
		numberOfNights = inputN.nextInt();

		int tripleA;
		Scanner inputA = new Scanner (System.in);
		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		tripleA = inputN.nextInt();


		int clubMember;
		Scanner inputC = new Scanner (System.in);
		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		clubMember = inputC.nextInt();
		boolean isClubMember = false;
		Random randNum = new Random();
		if(clubMember == 1 && randNum.nextInt(11) >= 4 && numberOfNights >=4) {
			isClubMember = true;
			System.out.println("\nCongratulations! You've qualified for our \"Stay 4 nights get 1 free promotion\""
				+ " \nDiscount will be applied during checkout depending on the number of days");
		}
		else if(clubMember == 1){
			System.out.println("\nUnfortunately, you didn't qualify for our \"Stay 4 nights get 1 free promotion\". Better luck"
					+ "\nnext time!");
		}
		else {
			isClubMember = false;
		}



		int complementary;
		int standard = 30;
		int deluxe = 50;
		int indulgence = 85;
		int mealPackage;

		Scanner inputM = new Scanner(System.in);

		if(roomChoice == 5) {
			System.out.println("\nMEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
			System.out.println("0. Complementary @ $0 per guest");
			System.out.println("1. Standard  @ $30 per guest");
			System.out.println("2. Deluxe @ $50 per guest");
			System.out.println("3. Indulgence @ $85 per guest");
			System.out.println("\nPlease select your desired meal package (enter 0/1/2/3 corresponding to the options shown above)");
			mealPackage = inputM.nextInt();

		}
		else {

			System.out.println("\nMEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
			System.out.println("0. Complementary @ $0 per guest");
			System.out.println("1. Standard  @ $30 per guest");
			System.out.println("2. Deluxe @ $50 per guest");
			System.out.println("\nPlease select your desired meal package (enter 0/1/2 corresponding to the options shown above)");
			mealPackage = inputM.nextInt();

		}
		switch(mealPackage) {
		case 1:
			mealPackage = 30;
			break;
		case 2:
			mealPackage = 50;
			break;
		case 3:
			mealPackage = 85;
			break;

		}

		if(roomChoice ==1) {
			roomChoice = singleR;

		}
		else if(roomChoice ==2) {
			roomChoice = doubleR;
		}
		else if(roomChoice ==3) {
			roomChoice = queenR;
		}
		else if (roomChoice ==4) {
			roomChoice = kingR;
		}
		else if (roomChoice ==5) {
			roomChoice = masterSuiteR;
		}

		System.out.println("\nCHECKOUT");

		double roomCost = roomChoice * numberOfNights;
		System.out.println("Room Cost:\t\t$" + roomCost);

		double mealCost = guest * numberOfNights * mealPackage;
		if (mealPackage != 0) {
			System.out.println("Meal Cost:\t\t+$" + mealCost);
		}

		double preliminaryCost = roomCost + mealCost;
		System.out.println("Preliminary Total Cost:\t$" + preliminaryCost);

		boolean hasTripleDiscount = false;
		boolean hasMemberDiscount = false;

		double aDiscount = preliminaryCost*0.1;
		if (tripleA == 1) {
			hasTripleDiscount = true;
			System.out.println("AAA Discount:\t\t-$" + aDiscount);
		}
		else {
			hasTripleDiscount = false;
		}
		double clubDiscount = numberOfNights / 4 *roomChoice;
		if (isClubMember) {
			hasMemberDiscount = true;
			System.out.println("Club Member Discount:\t-$" + clubDiscount);
		}

		if(hasTripleDiscount && hasMemberDiscount) {
			double totalCost1 = preliminaryCost - (aDiscount + clubDiscount);
			System.out.println("Total Cost of Booking:\t$" + totalCost1);
		}
		else if(hasTripleDiscount) {
			double totalCost2 = preliminaryCost - aDiscount;
			System.out.println("Total Cost of Booking:\t$" + totalCost2);
		}
		else if(hasMemberDiscount) {
			double totalCost3 = preliminaryCost - clubDiscount;
			System.out.println("Total Cost of Booking:\t$" + totalCost3);
		}
		else  {
			System.out.println("No Discounts Applied\t");
			System.out.println("Total Cost of Booking:\t$" + preliminaryCost);

		}
	}
}





