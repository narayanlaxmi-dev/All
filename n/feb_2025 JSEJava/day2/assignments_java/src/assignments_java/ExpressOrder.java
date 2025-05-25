package assignments_java;

public class ExpressOrder extends Order {
	private int extCharge;

	public ExpressOrder(int orderId, float totalCost, int extCharge) {
		super(orderId, totalCost);
		this.extCharge = extCharge;
		this.noDays = 2;
	}

	@Override
	public void calculatedDeliveryTime() {
		System.out.println("delivery time (Express): " + noDays + " days.");
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("\tExtra Charge: " + extCharge);
		System.out.println("\tTotal Cost: " + (totalCost + extCharge));
	}

	public void extracharge() {
		System.out.println("Extra Charge Applied: $" + extCharge);
	}
}
