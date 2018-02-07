/*
 * Application for computing a set of entered numbers and totaling
 * the sum. Entered characters will display a invalid message until a number
 * input is entered.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class part1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0, value = 1;
		
		do {
			try {
				//Enter a sum to be added
				System.out.println("Enter a number to be added up. (Enter 0 to evalute):");
				value = input.nextDouble();
				sum += value;
			}
			//If a number is not entered, an invalid message will appear
			catch (InputMismatchException ex) {
				System.out.println("Try again. (Input must be a number)");
				input.nextLine();
			}
			//Displays sum's total
		} while (value != 0);
		System.out.println("The sum's total is: " + sum);
	}
}
