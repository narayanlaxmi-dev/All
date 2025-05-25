package Assignment;

class Account {
	private int balance;

	public Account(int balance) {
		this.balance = balance;
		System.out.println("(constructor) The initial balance is: " + balance);
	}

	// Remove money
	public synchronized void withdraw(int amt) {
		if (amt <= balance) {
			balance -= amt;
			System.out.println(Thread.currentThread().getName() + " withdraw " + amt);
		} else
			System.out.println("this Amount not available " + Thread.currentThread().getName() + " to withdraw " + amt);

	}

	// Add money
	public synchronized void deposit(int amt) {
		balance += amt;
		System.out.println(Thread.currentThread().getName() + " deposited " + amt);
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
}

class depositT extends Thread {
	private Account account;

	public depositT(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			account.deposit(5000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class withdrawT extends Thread {
	private Account account;

	public withdrawT(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			account.withdraw(1500);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SynchronizationMultiThreading {

	public static void main(String[] args) {

		Account account = new Account(20000);

		depositT depositT = new depositT(account);
		withdrawT withdrawT = new withdrawT(account);
		
		depositT.start();
		withdrawT.start();
		account.withdraw(1000);
		account.deposit(2000);
		System.out.println("After processing the remaining balance is: " + account.getBalance());
	}
}
