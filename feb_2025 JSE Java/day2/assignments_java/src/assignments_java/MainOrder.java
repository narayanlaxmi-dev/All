package assignments_java;

public class MainOrder {

	public static void main(String[] args) {
		System.out.println("Express Order ---------");
		ExpressOrder eo = new ExpressOrder(1, 1000, 100);
		eo.calculatedDeliveryTime();
		eo.displayDetails();
		System.out.println("only available sub class ");
		eo.extracharge();

		System.out.println("\nRegular Order ---------");
		RegualrOrder ro = new RegualrOrder(2, 1000);
		ro.calculatedDeliveryTime();
		ro.displayDetails();
	}
}
