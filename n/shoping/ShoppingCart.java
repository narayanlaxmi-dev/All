package assignments_java3;

public class ShoppingCart {
	Product product[];
	final int MAX_SIZE = 100;
	private int size;
	private int total_cost;

	public ShoppingCart() {
		product = new Product[MAX_SIZE];
	}

	public void addProduct(Product p1) {
		if (size < MAX_SIZE) {
			product[size] = p1;
			total_cost += product[size].getProduct_price();
			size++;
		} else {
			System.out.println("Product is full...");
		}
	}

	public void removeProduct(int pid) {
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			if (product[i].getProduct_id() == pid) {
				total_cost -= product[i].getProduct_price();
				flag = true;
				for (int j = i; j < size - 1; j++) {
					product[j] = product[j + 1];
				}
				product[size - 1] = null;
				size--;
			}
		}
		if (!flag)
			System.out.println("NOT found product....");
	}

	public void displayProduct() {
		for (int i = 0; i < size; i++) {
			System.out.println(product[i]);
		}
		System.out.println("TOTAL :" + total_cost);
	}
}
