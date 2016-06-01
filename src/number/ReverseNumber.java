package number;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		// Read number from keyboard
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		String s = "";
		// convert to char array
		String num = Integer.toString(x);
		char[] y = num.toCharArray();

		System.out.println("Your number: " + x);

		if (x < 0) {
			// Handle negative numbers
			s = "-";
			for (int i = (y.length - 1); i >= 1; i--) {

				s = s + y[i];
			}
		} else {
			// Handle positive numbers
			for (int i = (y.length - 1); i >= 0; i--) {

				s = s + y[i];
			}
		}

		System.out.println("Reverse number: " + s);
	}

}
