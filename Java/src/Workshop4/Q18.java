package Workshop4;
class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class Q18 {
	public static void checkAge(int age) throws InvalidAgeException{
		if (age<18) {
			throw new InvalidAgeException("Age must be more than 18");
		}
	}
public static void main(String[] args) {
	try {
		checkAge(0);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
