package day1_pakage;

import java.util.Scanner;

public class ep6largest3no {

	public static void main(String[] args) {

		Scanner ob = new Scanner(System.in);
		System.out.println("Enter three number to check which is largest :");
		int a = ob.nextInt();
		int b = ob.nextInt();
		int c = ob.nextInt();

		if (a > b && a > c) {

			System.out.println(a + " largest");
			if (b > a && b > c) {

				System.out.println(b + " largest");
			} else
				System.out.println(c + " largest");
		}

	}

}
