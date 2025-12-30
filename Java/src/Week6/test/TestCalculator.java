package Week6.test;
import Workshop6.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestCalculator {

    private Calculator calculator;

    @BeforeAll
    static void initAll() {
        System.out.println("Starting Calculator tests...");
    }

    @AfterAll
   static void tearDownAll() {
        System.out.println("All Calculator tests completed.");
    }

    @BeforeEach
     void init() {
        calculator = new Calculator(); 
        System.out.println("Calculator initialized.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test finished. Cleaning up...");
        calculator = null; 
    }

    @Test
    void testAddition() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}