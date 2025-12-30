package Workshop6;

public class MyMath {
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	 public static int factorial(int n) {
	        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
	        int fact = 1;
	        for (int i = 2; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
}
