package Workshop4;

class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}

public class Q17 {
	static void checkAge(int age) throws AgeException {
		if (age < 18) {
			throw new AgeException("Age must be 18 or above!");
		}
		System.out.println("Valid age. Access granted.");
	}

	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (AgeException e) {
			System.out.println("Checked Exception Caught: " + e.getMessage());
		}
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Unchecked Exception Caught: " + e.getMessage());
		}
	}
}
