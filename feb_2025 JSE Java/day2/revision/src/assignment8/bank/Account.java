package assignment8.bank;

public class Account {
	  int accountNumber;
	  int balance;
	  Customer customer;
	public Account(int accountNumber, int balance, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}
	  

	public void deposite(int amt) {
		balance+=amt;
		System.out.println("Amount deposited successfully,Updated Balance:"+balance);
	}

	public void withdraw(int amt) {
		try {
		if(amt>balance) {
			throw new InsuffiecientFundException("Unsufficient fund ,Balance :"+balance);
		}
		else {
			balance-=amt;
			System.out.println("Successful withdrawel ,Balance:"+balance);
		}
		}
		catch(InsuffiecientFundException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

	public void displayDetails() {
		System.out.println("Account No:"+accountNumber);
		System.out.println("Balance :"+balance);
		customer.display();
	}
	   
	  
	}