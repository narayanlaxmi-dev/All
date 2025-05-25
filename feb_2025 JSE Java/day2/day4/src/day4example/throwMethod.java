package day4example;

import java.util.Scanner;

public class throwMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;

		try {
			System.out.println("Enter age:");
			age = sc.nextInt();
			checkAge(age);
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
		sc.close();
	}

//user define method 
	static void checkAge(int age) throws Exception {
		if (age < 18)
			throw new Exception("NOT ELIGIBLE");
		else
			System.out.println("Voting....");
	}

}