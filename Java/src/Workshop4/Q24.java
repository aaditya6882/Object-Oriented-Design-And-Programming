package Workshop4;

import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("Enter a number: ");
				int num = sc.nextInt();
				int result = 100 / num;
				System.out.println("Result: " + result);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero.");
				continue;
			} catch (Exception e) {
				System.out.println("Please enter a valid number.");
				continue;
			}
		}

	}
}
