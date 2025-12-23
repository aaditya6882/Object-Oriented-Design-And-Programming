package Week6.test;

import Tutorial6.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
	@Test
	void ThreePlusThreeEqualsSix() {
		Calculator calc = new Calculator();
		int output = calc.addNum(3, 3);
		int expected=6;
		Assertions.assertEquals(expected,output);
	}

}
