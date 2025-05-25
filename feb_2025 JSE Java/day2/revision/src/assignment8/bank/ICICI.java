package assignment8.bank;

public class ICICI extends Bank implements BankService {

	@Override
	public void loanService() {
		System.out.println("ICICI Provides personal loan with 10 %");

	}

	@Override
	public float getInterestRate() {
		// TODO Auto-generated method stub
		return minimumInterestRate+3.0f;
	}
	
	public void displayDetails() {
		   super.displayDetails();
		   System.out.println("Welcome to ICICI");
	   }

}
