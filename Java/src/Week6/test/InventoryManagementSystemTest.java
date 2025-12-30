package Week6.test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import Workshop6.InventoryManagementSystem;

public class InventoryManagementSystemTest {
	InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();

	@Test
	void testIsProductAvailable() {
		assertAll("InventoryManagement",
	            () -> assertTrue(inventoryManagementSystem.isProductAvailable("Laptop", 5)),
	            () -> assertFalse(inventoryManagementSystem.isProductAvailable("Laptop", 50)),
	            () -> assertFalse(inventoryManagementSystem.isProductAvailable("Phone", 1))
	        );
	}
}
