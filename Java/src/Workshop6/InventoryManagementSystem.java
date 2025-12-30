package Workshop6;

import java.util.HashMap;

public class InventoryManagementSystem {
	HashMap<String, Integer> inventory = new HashMap<String, Integer>();

	public InventoryManagementSystem() {
		inventory.put("Laptop", 20);
	}

	public boolean isProductAvailable(String productName, int quantity) {
		if (!inventory.containsKey(productName)) {
			return false;
		}
		int availableStock = inventory.get(productName);
        return quantity <= availableStock;
	}
}
