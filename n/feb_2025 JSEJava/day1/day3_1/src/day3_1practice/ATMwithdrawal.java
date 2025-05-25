package day3_1practice;

import java.util.*;

/*
 design prog take account balance and withdrawal amount input 
 check sufficient withdrawal
 check if 100 * return amount
 check if double  no 100 * multiple the amount multiple 
  */
public class ATMwithdrawal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("--- ATM withdrawl system ---");
		System.out.print("Enter account balance: ");
		double balance = sc.nextDouble();

		System.out.print("Enter withdrawal amount: ");
		double withdrawamt = sc.nextDouble();

		if (withdrawamt > balance) {
			System.out.println(" Insufficient");
		} else if (withdrawamt % 100 == 1) // check withdrawal is equal to 2
		{
			System.out.println(" Withdraw amount is not multiple of 100....");
		} else {
			balance -= withdrawamt;
			System.out.println(" withdrawl success.. remaning balance: " + balance);
		}
		sc.close();
	}

}
