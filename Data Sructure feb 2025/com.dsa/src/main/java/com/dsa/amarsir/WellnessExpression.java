package com.dsa.amarsir;

import java.util.Scanner;

public class WellnessExpression {
		public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		Stack_Class_Char obj = new Stack_Class_Char();// object created
		System.out.println("Enter pattern to check:");
		String pattern = in.next();// {{{}}} { { { } }.nextLine()
		obj.create_stack(pattern.length());
		// character by character reading
		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);// took a character
			if (c == '{')// if { push
				obj.push(c);
			if (c == '}') {
				if (obj.isempty() != true)
					obj.pop();
				else {
					flag = false;
					break;
				}
			}
		}
		if (obj.isempty() == true && flag == true)
			System.out.println("No Error");
		else
			System.out.println("Error");
	}
}
