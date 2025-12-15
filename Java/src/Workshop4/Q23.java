package Workshop4;

class LessAgeException extends RuntimeException {
	public LessAgeException(String msg) {
		super(msg);
	}
}

class InvalidNameException extends RuntimeException {
	public InvalidNameException(String msg) {
		super(msg);
	}
}

public class Q23 {
	static void validateUser(String name, int age) throws InvalidNameException, LessAgeException {
		if (name == null || name.trim().isEmpty()) {
			throw new InvalidNameException("Name cannot be empty");
		}
		if (age < 18) {
			throw new LessAgeException("Age must be 18 or above");
		}
		System.out.println("User is valid");
	}

	public static void main(String[] args) {
		try {
			validateUser("", 19);
		} catch (InvalidNameException e) {
			System.out.println("Name Error: " + e.getMessage());
		} catch (LessAgeException e) {
			System.out.println("Age Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
