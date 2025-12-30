package Week6.test;

import org.junit.jupiter.api.Test;

import Workshop6.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

	@Test
	void testArea() {
		Rectangle r = new Rectangle(5, 3);
		assertEquals(15, r.area());
	}

	@Test
	void testPerimeter() {
		Rectangle r = new Rectangle(5, 3);
		assertEquals(16, r.perimeter());
	}
}
