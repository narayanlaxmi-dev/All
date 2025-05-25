package day5;

public class PRODUCT {
	private String p_name;
	private float rate, qty;
	protected float amount;

	PRODUCT(float qty) {
		this.qty = qty;
	}

	void set(String p_name, float rate) {
		this.p_name = p_name;
		this.rate = rate;
		amount = rate * qty;
	}

	void show() {
		System.out.println("name :" + p_name + "\trate :" + rate + "\tqty :" + qty + "\tamount : " + amount);
	}
}

class BILL extends PRODUCT {
	private float discount, netamt;

	BILL(float qty) {
		super(qty);
		super.set("laptop", 100.10f); // name and rate
	}

	void set() {
		super.show();
		if (amount > 5000) {
			discount = amount * 10 / 100;
			netamt = discount * amount;
			System.out.println("10% discout :" + discount);
		} else {
			discount = amount * 5 / 100;
			netamt = discount * amount;
			System.out.println("5% discout :" + discount);
		}

	}

	void show() {
		System.out.println(
				"\tNet-salary with Discount :" + netamt + "\n\tNet-salary without discout :" + (netamt - discount));
	}

}
