package assignment8.bank;

public class SBI extends Bank implements BankService {

	@Override
	public void loanService() {
		System.out.println("SBI Provides Home Loan with 8.0% interest Rate");

	}

	@Override
	public float getInterestRate() {

		return minimumInterestRate + 2.5f;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Welcome to SBI");
	}

}
