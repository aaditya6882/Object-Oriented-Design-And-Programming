package Week6.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Workshop6.Q3;

public class Q3Test {
Q3 q3;
@BeforeEach
public void setUp() {
    q3 = new Q3();
}
@Test
public void testDeposit() {
	q3.deposit(100.0);
    assertEquals(100.0, q3.getBalance(), 0.001);
}
@Test
public void testWithdrawSuccess() {
    q3.deposit(100.0);
    boolean result = q3.withdraw(50.0);

    assertTrue(result);
    assertEquals(50.0, q3.getBalance(), 0.001);
}
@Test
public void testWithdrawFailure() {
    q3.deposit(50.0);
    boolean result = q3.withdraw(60.0);

    assertFalse(result);
    assertEquals(50.0, q3.getBalance(), 0.001);
}
}
