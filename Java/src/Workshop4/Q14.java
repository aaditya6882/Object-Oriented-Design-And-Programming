package Workshop4;

public class Q14 {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0); 
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("Exception Occured");
		}
	}
}
