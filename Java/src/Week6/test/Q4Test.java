package Week6.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import Workshop6.Q4;

public class Q4Test {
	Q4 q4;

	@Test
	public void testGetEvenNumbers() {
		int[] input = { 1, 2, 3, 4, 5, 6 };
		List<Integer> expected = Arrays.asList(2, 4, 6);

		List<Integer> actual = q4.getEvenNumbers(input);

		assertEquals(expected, actual);
	}
}
