package Week6.test;

import org.junit.jupiter.api.Test;

import Workshop6.MyMath;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

	@Test
	void testFactorial() {
		assertEquals(1, MyMath.factorial(0));
		assertEquals(1, MyMath.factorial(1));
		assertEquals(120, MyMath.factorial(5));
	}
}
