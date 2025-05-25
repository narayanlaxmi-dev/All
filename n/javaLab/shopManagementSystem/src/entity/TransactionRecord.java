package entity;

import java.time.LocalDate;

public class TransactionRecord {

	private String customerId;
	private String productId;
	private String Type;
	private LocalDate date;

	public TransactionRecord(String customerId, String productId, String type) {
		this.customerId = customerId;
		this.productId = productId;
		Type = type;
		this.date = LocalDate.now();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCustomerId() {
		return customerId;
	}

	@Override
	public String toString() {
		return "TransactionRecord [customerId=" + customerId + ", productId=" + productId + ", Type=" + Type + ", date="
				+ date + "]";
	}

}
