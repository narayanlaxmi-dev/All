package assignments_java;

public class MainBank {

	public static void main(String[] args) {
		BankA customerA = new BankA();
		BankB customerB = new BankB();
		BankC customerC = new BankC();
		System.out.println("------ Default (0) BANK INTREST --------");
		customerA.setBalance(2000);
		System.out.println("user " + customerA.getBalance());
		System.out.println("Intrest : " + customerA.applyBalance());

		customerB.setBalance(3000);
		System.out.println("user " + customerB.getBalance());
		System.out.println("Intrest : " + customerB.applyBalance());

		customerC.setBalance(4000);
		System.out.println("user " + customerC.getBalance());
		System.out.println("Intrest : " + customerC.applyBalance());

		System.out.println("------ AFTER APPLY BANK INTREST --------");
		Bank.Intrest = 0.2;
		System.out.println("Intrest : " + customerA.applyBalance());
		System.out.println("Intrest : " + customerB.applyBalance());
		System.out.println("Intrest : " + customerC.applyBalance());
	}

}
