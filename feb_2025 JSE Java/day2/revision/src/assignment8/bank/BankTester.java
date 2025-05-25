package assignment8.bank;

import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) {
		Customer c=new Customer("Prasad", 35);
		Account acc=new Account(1001, 5000, c);
		Bank[] banks=new Bank[2];
		banks[0]=new SBI();
		banks[1]=new ICICI();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu Option\r\n"
					+ "1. View Account Details\r\n"
					+ "2. Deposit Money\r\n"
					+ "3. Withdraw Money\r\n"
					+ "4. Show Bank Details\r\n"
					+ "5. Loan Services\r\n"
					+ "6. Exit\r\n"
					+ "");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				acc.displayDetails();
				break;
			case 2:
				System.out.println("Enter the amount for deposite");
				int amt=sc.nextInt();
				acc.deposite(amt);
				break;
			case 3:
				System.out.println("Enter the amount for withdraw");
				int amt1=sc.nextInt();
				acc.withdraw(amt1);
				break;
			case 4:
				for(Bank b:banks) {
					b.displayDetails();
				}
				break;
			case 5:
				BankService[] services=new BankService[2];
				services[0]=new SBI();
				services[1]=new ICICI();
				for(BankService s:services) {
					s.loanService();
				}
				break;
			case 6:
				System.out.println("Thank you for using application...");
				break;
			default:
				 System.out.println("Enter valid choice");
				 break;
				
				
				 
			}
		}
		while(choice!=6);

	}

}
