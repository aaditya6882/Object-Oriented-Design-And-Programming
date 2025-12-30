package Week6.test;

import org.junit.jupiter.api.Test;

import Workshop6.Circle;
import Workshop6.RectangleShape;
import Workshop6.Shape;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

	@Test
	void testBaseShapeArea() {
		Shape s = new Shape();
		assertEquals(0, s.area());
	}

	@Test
	void testCircleArea() {
		Circle c = new Circle(3);
		assertEquals(Math.PI * 9, c.area(), 0.001);
	}

	@Test
	void testRectangleArea() {
		RectangleShape r = new RectangleShape(4, 5);
		assertEquals(20, r.area());
	}
}
