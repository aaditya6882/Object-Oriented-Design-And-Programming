package Workshop6;

public class StringManupulator {

	public String reverse(String input) {
		if (input == null) {
			return null;
		}
		return new StringBuilder(input).reverse().toString();
	}

	public String toUpperCase(String input) {
		if (input == null) {
			return null;
		}
		return input.toUpperCase();
	}

	public boolean isPalindrome(String input) {
		if (input == null) {
			return false;
		}
		String reversed = new StringBuilder(input).reverse().toString();
		return input.equals(reversed);
	}

	public int countVowels(String input) {
		if (input == null) {
			return 0;
		}

		int count = 0;
		input = input.toLowerCase();

		for (char ch : input.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
}
