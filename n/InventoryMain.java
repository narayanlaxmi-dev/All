package aentity;

public class InventoryMain {
	
	public static void main(String[] args) {
		
		Inventory i = new Inventory();
		Product p = new Product(0101, "pen", "nyNarayan");

		i.addProduct(p);
		i.addProduct(p);

		System.out.println("____________");
		i.displayAllProduct();
		i.saveInventoryToFile("inventory_log.txt");

		i.removeProduct(p);

		System.out.println("____________");
		i.displayAllProduct();
		i.saveInventoryToFile("inventory_log.txt");
	}
}
