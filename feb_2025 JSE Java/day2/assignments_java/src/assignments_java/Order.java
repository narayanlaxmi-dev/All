package assignments_java;

public class Order {
	private int orderId;
	protected float totalCost;
	protected int noDays;

	public Order(int orderId, float totalCost) {
		this.orderId = orderId;
		this.totalCost = totalCost;
		this.noDays = 5; // Default for regular orders
	}

	public void calculatedDeliveryTime() {
		System.out.println("delivery time: " + noDays + " days.");
	}

	public void displayDetails() {
		System.out.println("Order ID: " + orderId + "\tDelivery Days: " + noDays + "\tTotal Cost: $" + totalCost);
	}
}
