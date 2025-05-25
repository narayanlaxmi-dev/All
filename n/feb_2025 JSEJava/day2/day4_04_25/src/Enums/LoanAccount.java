package Enums;

public class LoanAccount {
	private int accountNo;
	private String name;
	private int amount;
	private LoanType type;

	public LoanAccount() {
		accountNo = 101;
		name = "nayan";
		amount = 10000;
		type = LoanType.HOME;
	}
	
	public LoanAccount(int accountNo, String name, int amount, LoanType type) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.amount = amount;
		this.type = type;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setType(LoanType type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public LoanType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "LoanAccount --> [accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + ", type=" + type + "]";
	}
}
