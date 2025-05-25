package Assignment;
// user enter number we have to find out it number string or character we String number declare

import java.util.Scanner;

public class numberFormatException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		String num = sc.nextLine();
		sc.close();
		try {
			double no1 = Double.parseDouble(num);
			double result = no1 * no1;
			System.out.println(result);
		} catch (NumberFormatException n) {
			System.out.println("Exception Handled " + n.getMessage());
		}
	}

}
