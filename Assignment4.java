/**
*Enter 3 different cities and they will be listed in
*ascending order.
*/
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner city = new Scanner(System.in);
		
		//First city input
		System.out.println("Enter first city: ");
		String city1 = city.nextLine();
		
		//Second city input
		System.out.println("Enter second city: ");
		String city2 = city.nextLine();
		
		//Third city input
		System.out.println("Enter third city: ");
		String city3 = city.nextLine();
		
		//City comparison and output
		if ((city1.compareToIgnoreCase(city2) < 0) && (city2.compareToIgnoreCase(city3) < 0)) {
			System.out.println("The cities in alphabetical order are: " + city1 + ", " +
		city2 + ", " + city3);
		}
		else if ((city2.compareToIgnoreCase(city1) < 0) && (city1.compareToIgnoreCase(city3) < 0)) {
			System.out.println("The cities in alphabetical order are: " + city2 + ", " +
					city1 + ", " + city3);
		}
		else if ((city3.compareToIgnoreCase(city2) < 0) && (city2.compareToIgnoreCase(city1) < 0)) {
			System.out.println("The cities in alphabetical order are: " + city3 + ", " +
					city2 + ", " + city1);
		}
		else if ((city1.compareToIgnoreCase(city3) < 0) && (city3.compareToIgnoreCase(city2) < 0 )) {
			System.out.println("The cities in alphabetical order are: " + city1 + ", " +
					city3 + ", " + city2);
		}
		else if ((city2.compareToIgnoreCase(city3) < 0) && (city3.compareToIgnoreCase(city1) < 0 )) {
			System.out.println("The cities in alphabetical order are: " + city2 + ", " +
					city3 + ", " + city1);
		}
		else if ((city3.compareToIgnoreCase(city2) < 0) && (city1.compareToIgnoreCase(city2) < 0 )) {
			System.out.println("The cities in alphabetical order are: " + city3 + ", " +
					city1 + ", " + city2);
		}

	}

}
