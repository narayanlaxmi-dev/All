package assignments_java3;

public class ShoppingCardMAIN {

	public static void main(String[] args) {

		ShoppingCart shop = new ShoppingCart();
		Product p1 = new Product(01, "pen", 50);
		shop.addProduct(p1);
		shop.addProduct(new Product(02, "joint", 50));
		shop.addProduct(new Product(03, "services", 50));
		shop.addProduct(new Product(04, "shirt", 150));
		shop.displayProduct();

		System.out.println("------ Remove product ------");
		shop.removeProduct(2); // remove 2 product
		shop.displayProduct();
	

	}

}
