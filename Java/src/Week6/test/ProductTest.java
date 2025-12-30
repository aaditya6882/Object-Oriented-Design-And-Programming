package Week6.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Workshop6.Product;

public class ProductTest {

	@Test
	void testProductAssertionsUsingAssertAll() {
		Product product = new Product("Laptop", 5000.0, 2);

		assertAll("Product validation", () -> assertNotNull(product.getName(), "Name should not be null"),
				() -> assertTrue(product.getPrice() > 0, "Price should be positive"),
				() -> assertTrue(product.isAffordable(1200.0), "Should be affordable with higher budget"),
				() -> assertFalse(product.isAffordable(900.0), "Should not be affordable with lower budget"));
	}
}
