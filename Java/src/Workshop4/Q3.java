package Workshop4;
/*
 * 	- Exception
 * 		- IOException
 * 		- SQLException
 * 		- RuntimeException
 * 			- ArithmeticException
 * 			- NullPointerException
 */

public class Q3 {
	public static void main(String[] args) {
		Class<?> cls = (new ArithmeticException()).getClass();
		while (cls != null) {
			System.out.println(cls.getName());
			cls = cls.getSuperclass();
		}
	}
}
