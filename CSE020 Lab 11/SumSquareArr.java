import java.util.Scanner;

public class SumSquareArr {
	public static void main(String[] args) {
Scanner maxN = new Scanner(System.in);
int maxNumber;
System.out.println("Please enter the maximum number: ");
maxNumber = maxN.nextInt();
if(maxNumber == 0) {
	System.out.println("\nNo numbers to sum up. Exiting Program.");
}
else {
int[] arr1 = new int[maxNumber + 1];
int[] arr2 = new int[maxNumber + 1];
int[] arr3 = new int[maxNumber + 1];
int i = 1;

System.out.println("\nContents of Arr1 (for-loop), Arr2 (while-loop), Arr3 (do-while-loop) are:");

for (i = 1; i <= maxNumber; i++)
	arr1[i] = arr1[i-1]+ i*i;
	i = 1;
	
	while (i <= maxNumber) {
		arr2[i] = arr2[i - 1] + i*i;
		i++;
	}

	i = 1;
	
	do
		arr3[i] = arr3[i - 1] + i*i;
	while (++i <= maxNumber);
	
	for (i = 0; i <= maxNumber; i++)
		System.out.println("Arr1: " + arr1[i] + ", Arr2: " + arr2[i] + ", Arr3: " + arr3[i]);
	
	System.out.println("\nSum of numbers 1 to max is: " + arr1[maxNumber]);

	maxN.close();
}
}
}
