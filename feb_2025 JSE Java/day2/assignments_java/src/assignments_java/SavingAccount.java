package assignments_java;

public class SavingAccount {
	private static double annualInterestRate; // same of all obj
	private double savingsBalance;

	public SavingAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static void modifyAnnualInterestRate(double newRate) {
		annualInterestRate = newRate;
	}

	public void calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;

		double yearlyInterest = savingsBalance * annualInterestRate; // for yearly

		System.out.println("Per Month Interest: " + monthlyInterest);
		System.out.println("Per Year Interest: " + yearlyInterest);
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}
}
