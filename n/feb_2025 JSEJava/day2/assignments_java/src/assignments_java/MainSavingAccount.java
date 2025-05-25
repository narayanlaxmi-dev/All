package assignments_java;

public class MainSavingAccount {

	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(2000); // saving acc
		SavingAccount saver2 = new SavingAccount(3000);

		// display balance before apply intrest
		System.out.println("1 uesr monthly balance : " + saver1.getSavingsBalance());
		System.out.println("2 uesr monthly balance : " + saver2.getSavingsBalance());

		// setting anual intrest
		SavingAccount.modifyAnnualInterestRate(0.3); // intrest rate

		// calculate monthly intrest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		// display after apply intrest
		System.out.println("Saving balance : " + saver1.getSavingsBalance());
		System.out.println("Saving balance : " + saver2.getSavingsBalance());

//		updating intrest rate to new value
		SavingAccount.modifyAnnualInterestRate(0.4);

		// calculate monthly intrest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		// display after apply intrest
		System.out.println("Saving balance : " + saver1.getSavingsBalance());
		System.out.println("Saving balance : " + saver2.getSavingsBalance());
	}

}
