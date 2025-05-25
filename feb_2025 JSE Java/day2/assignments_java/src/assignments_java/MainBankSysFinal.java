package assignments_java;

public class MainBankSysFinal {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		AccSaving a = new AccSaving();
		b.calcIntrest(2, 1000);
		b.showdetails();
		a.calcsavingIntrest(1, 1000);
		a.showdetails();
	}
}
