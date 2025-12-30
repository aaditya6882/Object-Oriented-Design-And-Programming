package Week6.test;

import org.junit.jupiter.api.Test;

import Workshop6.MyMath;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {

	@Test
	void testPrimeNumber() {
		assertTrue(MyMath.isPrime(7));
		assertTrue(MyMath.isPrime(2));
	}

	@Test
	void testNonPrimeNumber() {
		assertFalse(MyMath.isPrime(1));
		assertFalse(MyMath.isPrime(4));
		assertFalse(MyMath.isPrime(0));
		assertFalse(MyMath.isPrime(-5));
	}
}
