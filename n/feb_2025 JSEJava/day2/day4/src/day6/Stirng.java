package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Stirng {

	public static void main(String[] args) {
		String groc[] = { "apple", "mango", "grapes", "watermallon" };
		System.out.println(groc.length);
		System.out.println(groc[0].length());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Word: ");
		String s = sc.nextLine();
		System.out.println("the length of string is :=" + s.length());
		System.out.println("the location index 3 character is :=" + s.charAt(3));

		System.out.println("upper := " + s.toUpperCase());
		int i, j;
//		for (i = 0; i < s.length(); i++) {
//			System.out.print(" |String [" + i + "] = " + s.charAt(i) + "|");
//
//		}

		// normal print
		for (i = 0; i < s.length(); i++) {
			for (j = 0; j <= i; j++) {

				System.out.print(" " + s.charAt(j));
			}
			System.out.println();
		}

		// reverse print
		for (i = s.length() - 2; i >= 0; i--) {
			for (j = 0; j <= i; j++) {

				System.out.print(" " + s.charAt(j));
			}
			System.out.println();
		}

		System.out.println("Enter second Word: ");
		String s2 = sc.nextLine();
		System.out.println("Concinated names: " + s.concat(s2));
		System.out.println("REPLACED names: " + s.replace('a', 'N'));

		System.out.println("COMPARE :-" + s.compareTo(s2));
		int com = s.compareTo(s2);
		if (com == 0)
			System.out.println("compare.... :-" + s.compareTo(s2));
		else
			System.out.println("NOT compare.... :-" + s.compareTo(s2));
	}
}
