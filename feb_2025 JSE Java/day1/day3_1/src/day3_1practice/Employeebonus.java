package day3_1practice;

import java.util.*;

public class Employeebonus {

	public static void main(String[] args) {
		int salary, year;
		float amt;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name:");
		System.out.println("Enter salary :");
		salary = sc.nextInt();
		System.out.println("Enter year of Experience :");
		year = sc.nextInt();

		if (year < 5) {
			amt = salary * 0.05f;
			System.out.println("5% bonus :-" + amt);
		} else if (year > 5) {
			amt = salary * 0.1f;
			System.out.println("10% bonus :-" + amt);
		} else
			System.out.println(" no bonus :-" + salary);
		sc.close();
	}

}
