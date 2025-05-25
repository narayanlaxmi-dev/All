package Enums;

import java.util.ArrayList;
import java.util.List;

public class LoanAccountMain {

	public static void main(String[] args) {
		List<LoanAccount> loanAccount = new ArrayList<LoanAccount>();
		LoanAccount loan1 = new LoanAccount();
		LoanAccount loan2 = new LoanAccount(102, "neyan", 2000, LoanType.GOLD);
		LoanAccount loan3 = new LoanAccount(103, "LNSHN", 10, LoanType.CAR);
		LoanAccount loan4 = new LoanAccount(105, "sh", 1000000, LoanType.EDUCATIONAL);
		LoanAccount loan5 = new LoanAccount(104, "hn", 19000, LoanType.HOME);
		
		//adding in list
		loanAccount.add(loan1);
		loanAccount.add(loan2);
		loanAccount.add(loan3);
		loanAccount.add(loan4);
		loanAccount.add(loan5);
		
		// printing all 
		for(LoanAccount l : loanAccount)
			System.out.println(l);
		
		// printing lony loan acc
		System.out.println("------ print only homeloan data's ------");
		for(LoanAccount l : loanAccount) {
			LoanType lo = l.getType();
			if(lo.equals(lo.HOME))
			System.out.println(l);
		}
	}

}
