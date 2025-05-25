package entity;

import exception.IllegalAccountException;
import exception.InsufficientFundException;

public abstract class Account {
	long id; // default access pgk
	protected double balance;

	
//	public Account(int id, double balance) {
//		super();
//		this.id = id;
//		this.balance = balance;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount) throws InsufficientFundException;

	public void transfer(double amount, Account that) throws IllegalAccountException {
		if (this == that) {
			throw new IllegalAccountException("Both accounts are Same!!!");
		}
		this.withdraw(amount);// current acc take money
		that.deposit(amount); // that acc deposit money
	}

}
