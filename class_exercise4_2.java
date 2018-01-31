//Enter full name and returns greeting of family name

import java.util.Scanner;

public class class_exercise4_2 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String fullname = name.nextLine();
		System.out.println("Hello Mr./Ms./Mrs." + fullname.substring(fullname.lastIndexOf(" ")) + "!");
	}
}
