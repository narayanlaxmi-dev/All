package assignments_java3;

public class Product {
	private int product_id;
	private String product_name;
	private float product_price;


	public Product(int product_id, String product_name, float product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ",\tproduct_name=" + product_name + ",\tproduct_price="
				+ product_price + "]";
	}

}
