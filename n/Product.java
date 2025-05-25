package aentity;

public class Product {
	private int productid;
	private String productName;
	private String mgf;
	
	public Product() {
	
	}
	public Product(int productid, String productName, String mgf) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.mgf = mgf;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getMgf() {
		return mgf;
	}
	public void setMgf(String mgf) {
		this.mgf = mgf;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", mgf=" + mgf + "]";
	}
	
}
