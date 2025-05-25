package com.dsa.mam;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num = 0;
		System.out.println("---Fibonacci Series Program---\n Enter number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=0; i<num; i++)
			System.out.println("The Fibo is: " + fibonaccilfun(i));
		sc.close();
	}

	public static int fibonaccilfun(int x) {
		if (x <= 1)
			return x;
		return fibonaccilfun(x - 1) + fibonaccilfun(x - 2);

	}
}
