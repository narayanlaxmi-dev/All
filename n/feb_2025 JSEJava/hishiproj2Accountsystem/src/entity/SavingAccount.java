package entity;

import exception.InsufficientFundException;

// cant inheritated
public final class SavingAccount extends Account implements Profitable {
	// static for all project share final no one change final naming convension is
	// CAPITAL
	private static final double MIN_BAL = 5000;
	private static double rate = 0.5;

	public SavingAccount() {
		balance = MIN_BAL;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + " Deposited successfully.......");
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundException {
		if (balance - amount < MIN_BAL)
			throw new InsufficientFundException("Minimun 500 required hai Bhai.... ");

		balance -= amount;
		System.out.println(amount + " withdraw successfully, currentAccount, remaning balance is " + balance);
	}

	@Override
	public void addIntrest(int year) {
		balance += (balance * rate * year) / 100;
		System.out.println(" added intrest in Saving account");
	}

}
