package day4example;

import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a, b, ans1, ans2;
		Scanner sc = new Scanner(System.in);
		// series wise executed try->catch->finally
		try {
			System.out.println("Enter number 1:");
			a = sc.nextInt();
			System.out.println("Enter number 2:");
			b = sc.nextInt();

			ans1 = a + b;
			System.out.println("Addition = " + ans1);
			ans2 = a / b;
			System.out.println("Divisible = " + ans2);
			ans1 = a * b;
			System.out.println("Multiply = " + ans1);
		} catch (Exception obj) {
			System.out.println("user define: NOT DIVISIBLE BY ZERO(0)");
			System.out.println("pre  define: " + obj);
			System.exit(0); // terminate program
		} finally {
			System.out.println("Finally executed if exit not wiritten");
		}
		System.out.println("outside any fun / method present in main ");
		sc.close();
	}

}
