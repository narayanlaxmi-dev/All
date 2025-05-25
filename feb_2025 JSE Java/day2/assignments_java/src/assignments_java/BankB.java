package assignments_java;

public class BankB extends Bank {
	private double balance;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double applyBalance() {
		return getBalance() * (Intrest + 0.4);
	}
}
