package assignments_java;

public class BankC extends Bank {
	private double balance ;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double applyBalance() {
		  return getBalance() * (1 + Intrest + 0.5);
//		return getBalance() * (Intrest + 0.5);
	}
}
