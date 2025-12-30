package Week6.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Workshop6.Q1;

public class Q1test {
	Q1 q1 =new Q1();
	@Test
	public void testCelsiusToFahrenheit() {
		assertEquals(32.0, q1.celsiusToFahrenheit(0), 0.001);
		assertEquals(212.0, q1.celsiusToFahrenheit(100), 0.001);
		assertEquals(98.6, q1.celsiusToFahrenheit(37.0), 0.001);
	}

	@Test
	public void testFahrenheitToCelsius() {
		assertEquals(0.0, q1.fahrenheitToCelsius(32), 0.001);
		assertEquals(100.0, q1.fahrenheitToCelsius(212), 0.001);
		assertEquals(37.0, q1.fahrenheitToCelsius(98.6), 0.001);
	}
}
