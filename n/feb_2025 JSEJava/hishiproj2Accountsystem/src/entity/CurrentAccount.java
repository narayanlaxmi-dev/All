package entity;

import exception.InsufficientFundException;

public final class CurrentAccount extends Account {

	public CurrentAccount() {

	}

	@Override
	public void deposit(double amount) {
		// intrest added in 10% if -ve numbers
		if (balance > 0) {
			amount *= 0.9;
			System.out.println(" 10 % intrest");
		}
		balance += amount;
		System.out.println(amount + " Deposited successfully currentAccount.......");
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundException {
		balance -= amount;
		System.out.println(amount + " withdraw successfully, currentAccount, remaning balance is " + balance);
	}

}
