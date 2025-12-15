package Workshop4;

import java.lang.classfile.Superclass;
import java.util.Scanner;

class NegativeNumberException extends RuntimeException{
	public NegativeNumberException(String msg) {
		super(msg);
	}
}
public class Q6 {
	public static void checkNum(int num) {
		if (num < 0) {
			throw new NegativeNumberException("Enter positive numbers");
		}
		System.out.println(num);
	}
public static void main(String[] args) {
	int num = 0;
	do {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.print("Enter a number: ");
			 num=scanner.nextInt();
			checkNum(num);
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
	} while (num<0);
	
}
}
