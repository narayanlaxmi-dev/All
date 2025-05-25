package com.dsa.amarsir;

import java.util.Scanner;

public class Stack_Reversal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack_Class_Char obj = new Stack_Class_Char();
		System.out.println("Enter Word to reversed:");
		String word = sc.next();

		obj.create_stack(word.length());
		for (int i = 0; i < word.length(); i++)
			obj.push(word.charAt(i));

		String rev_str = "";
		while (!obj.isempty()) {
			rev_str += obj.pop();
		}

		System.out.println("Reversed String: " + rev_str);
		sc.close();
	}
}
