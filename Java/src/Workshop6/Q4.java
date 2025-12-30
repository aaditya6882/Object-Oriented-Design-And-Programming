package Workshop6;

import java.util.ArrayList;
import java.util.List;

public class Q4 {
	public static List<Integer> getEvenNumbers(int[] numbers) {
		List<Integer> evenNumbers = new ArrayList<>();

		for (int num : numbers) {
			if (num % 2 == 0) {
				evenNumbers.add(num);
			}
		}
		return evenNumbers;
	}
}
