
package Week6.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import Workshop6.StringManupulator;

public class TestStringManupulator {

	StringManupulator manipulator = new StringManupulator();

	@Test
	void testStringManipulatorMethods() {
		assertAll("String Manipulator Tests", () -> assertEquals("avaJ", manipulator.reverse("Java")),
				() -> assertEquals("JAVA", manipulator.toUpperCase("java")),
				() -> assertTrue(manipulator.isPalindrome("madam")),
				() -> assertFalse(manipulator.isPalindrome("java")),
				() -> assertEquals(2, manipulator.countVowels("Java")));
	}
}
