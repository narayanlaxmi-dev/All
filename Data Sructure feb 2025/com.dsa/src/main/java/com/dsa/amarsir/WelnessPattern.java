package com.dsa.amarsir;

import java.util.Scanner;

public class WelnessPattern {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Stack_Class_Char obj = new Stack_Class_Char();// object created
		System.out.println("Enter pattern to check:");
		String pattern = in.next();// {{{}}} { { { } }.nextLine()
		obj.create_stack(pattern.length());
		// character by character reading
		for (int i = 0; i < pattern.length(); i++) {

			char c = pattern.charAt(i);// took a character
			if (c == '{')// if { push
				obj.push(c);
			else if (c == '}' && !obj.isempty())// if }pop iff stack not empty
			{
				obj.pop();
			} else {
				System.out.println("Error 1");// {{}}}
				return; // instead use break use return to direct return error
			}
		}

		if (obj.isempty())
			System.out.println("No Error -");// {{{}}}
		else
			System.out.println("Error 2"); // {{{}}
		in.close();
	}
}
