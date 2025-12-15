package Workshop4;

public class Q1 {
	public static void causeError() {
		causeError();
	}
	public static void main(String[] args) {
//		 System.out.println(10 / 0); // Exception
		causeError(); // Error
	}
}
