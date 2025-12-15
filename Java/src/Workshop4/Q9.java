package Workshop4;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class Q9 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter a name: ");
	String name= scanner.nextLine();
	if (name.length()<3) {
		throw new RuntimeException();
	}
}
}
