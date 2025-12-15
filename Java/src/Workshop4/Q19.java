package Workshop4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q19 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	try {
		System.out.print("Enter a number: ");
		scanner.nextInt();
	} 
	catch (InputMismatchException e) {
		System.out.println("Please Enter a Integer");
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
