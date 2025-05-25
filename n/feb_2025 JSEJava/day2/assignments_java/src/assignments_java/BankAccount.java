package assignments_java;

final class BankPolicy {
	void showpolicy() {
		System.out.println("you cannot change policies...");
	}
}

public class BankAccount {
	protected final int acc_no = 100; // constant cannot be change
	private int balance;

	final double calcIntrest(int year, int intrestRate) {

		return (year * intrestRate * balance);

	}

	public void showdetails() {
		System.out.println("acc no:" + acc_no + "\tbalance :" + balance+" calc intrest:"+calcIntrest(2,1000));
	}

}

class AccSaving extends BankAccount {
	int intrate;

	final double calcsavingIntrest(int year, int intrestRate) {

		return super.calcIntrest(year, intrestRate);
	}

	public void showdetails() {
		super.showdetails();
	}
}