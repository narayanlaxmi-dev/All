package com.dsa.amarsir;

import java.util.Scanner;



public class Check_Wellness {
	static Scanner in = new Scanner(System.in);

	static boolean isValid(String p1)
	// read pattern and return true of false
	{
		
		Stack_Class_Char obj = new Stack_Class_Char(); // object created
		obj.create_stack(p1.length());
		// character by character reading
		for (int i = 0; i < p1.length(); i++) {
			char c = p1.charAt(i);// took a character
			if (c == '{')// if { push
				obj.push(c);
			if (c == '}') {
				if (!obj.isempty())
					obj.pop();
				else {
					return false;
				}
			}
		}
	
//			return true;// or
		return obj.isempty();
	

	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter pattern to check:");
		String pattern = in.next();
		System.out.println(pattern + " Valid is:" + isValid(pattern));
		in.close();
	}

}
