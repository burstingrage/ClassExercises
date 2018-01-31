//Square rooting a number

import java.util.Scanner;

public class class_exercise4_1 {
	public static void main(String [] args) {
	System.out.println("Enter a number to be sqaure rooted:");
	Scanner input = new Scanner(System.in);
	double square = input.nextDouble();
	double calculations = Math.sqrt(square);
	System.out.println(calculations);
	}
}
