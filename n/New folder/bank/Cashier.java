package bank;

import entity.Account;
import entity.SavingAccount;
import util.BankManager;

public class Cashier {

	public static void main(String[] args) {

		System.out.println("----WELCOME TO CDAC BANK-----");

		Account hel = BankManager.openSavingAccount();
		Account yoo = BankManager.openCurrentAccount();

		System.out.println(hel);
//		System.out.println(hel.toString());
		System.out.println(yoo.toString());

		System.out.println("_____________ deposit _____________");
		hel.deposit(8000);
		yoo.deposit(8000);

		System.out.println(hel);
		System.out.println(yoo);

		System.out.println("_____________ withdrawl _____________");
		try {
			yoo.withdraw(10000);
			System.out.println(yoo);
			hel.withdraw(150000);
			System.out.println(hel);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		System.out.println(" penelty paid");
		yoo.deposit(10000);
		System.out.println(hel);
		System.out.println(yoo);

		System.out.println("Transfer balance ");
		hel.transfer(3000, yoo);
		System.out.println(hel);
		System.out.println(yoo);

		System.out.println("__________________");
		try {
			hel.transfer(4000, hel);
			System.out.println(hel);
			System.out.println(yoo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(" Down Casting");
		System.out.println(hel);
		((SavingAccount) hel).addIntrest(1);
		System.out.println(hel);
	}
}
