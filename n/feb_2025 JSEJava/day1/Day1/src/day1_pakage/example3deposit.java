package day1_pakage;

// deposit  si = p*r*n/100
import java.util.Scanner;

public class example3deposit {

	public static void main(String[] args) {
		int principal_sal, year;
		float rate, si, amount;

		Scanner ob = new Scanner(System.in);
		System.out.println("Enter Principle amount to calculate net-salary: ");
		principal_sal = ob.nextInt();
		System.out.println("Enter number of  year :");
		year = ob.nextInt();
		System.out.println("Enter rate of intrest :");
		rate = ob.nextFloat();
		ob.close();
		si = principal_sal * rate * year / 100;
		amount = si + principal_sal;
		System.out.println("Simple intrest : " + si);
		System.out.println("Amount =" + amount);
	}
}
