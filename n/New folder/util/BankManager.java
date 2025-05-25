package util;

import entity.Account;
import entity.CurrentAccount;
import entity.SavingAccount;

public class BankManager {
	private static long accNO;

	static {
		accNO = System.currentTimeMillis() % 1000000;// digits is 6
	}

	public static Account openSavingAccount() {
		SavingAccount acc = new SavingAccount();
		acc.setId(1000000 + ++accNO); // start with 1
		return acc;
	}
	public static Account openCurrentAccount() {
		CurrentAccount acc = new CurrentAccount();
		acc.setId(2000000 + ++accNO); 
		return acc;
	}
}
