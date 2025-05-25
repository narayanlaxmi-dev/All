package aentity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product p) {
		products.add(p);
	}

	public void removeProduct(Product p) {
		products.remove(p);
	}

	public void displayAllProduct() {
		for (Product p : products) {
			System.out.println(p);
		}
	}

	// New method to save inventory to file
	public void saveInventoryToFile(String filename) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
			writer.write("----- Inventory Snapshot -----\n");
			for (Product p : products) {
				writer.write(p.toString() + "\n");
			}
			writer.write("------------------------------\n\n");
			System.out.println("Inventory saved to " + filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
