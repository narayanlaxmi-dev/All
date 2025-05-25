package entity;



public class Customers {
	private String customerId;
	private String customerName;
	private String customerContactno;

	private static int Cid;
	static {
		Cid = 200;
	}

	public Customers() {

	}

	
	public Customers(String customerName, String customerContactno) {
		this.customerId = "c" + ++Cid;
		this.customerName = customerName;
		this.customerContactno = customerContactno;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerContactno() {
		return customerContactno;
	}


	public void setCustomerContactno(String customerContactno) {
		this.customerContactno = customerContactno;
	}


	public static int getCid() {
		return Cid;
	}


	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", customerContactno="
				+ customerContactno + "]";
	}


	

}
