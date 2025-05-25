package com.dsa.amarsir;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Stack_Class obj = new Stack_Class();
		obj.create_stack(64);

		System.out.println("Enter number");
		int n = in.nextInt();

		while (n > 0) {
			obj.push(n % 2);
			n = n / 2;
		}
		System.out.println("Binary is : ");
		while (!obj.isempty()) {
			System.out.println(obj.pop());
		}
		in.close();
	}
}
