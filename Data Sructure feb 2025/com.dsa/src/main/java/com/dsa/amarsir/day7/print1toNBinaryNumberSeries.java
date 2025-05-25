package com.dsa.amarsir.day7;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class print1toNBinaryNumberSeries {

	static List<String> generatedBinaryNumber(int number) {
		Queue<String> queue = new LinkedList<String>();
		List<String> sol = new LinkedList<String>();
		queue.add("1");
		String v1 = "";
		while (number > 0) {
			// without return void function
//			v1 = queue.poll();
//			System.out.print(v1+" "); // void 
//			
//			queue.add(v1 + "0");
//			queue.add(v1 + "1");
			// or
			v1 = queue.poll();
			sol.add(v1);
			queue.add(v1 + "0");
			queue.add(v1 + "1");
			number--;
		}
		return sol;
	}

	
	
	
	static void generatedBNNoReturn(int number) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("1");
		String v1 = "";
		while (number > 0) {
			// without return void function
			v1 = queue.poll();
			System.out.print(v1+" "); // void 
			
			queue.add(v1 + "0");
			queue.add(v1 + "1");
			
			number--;
		}
		
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = in.nextInt();
		List<String> a = generatedBinaryNumber(number);
		System.out.println(a);
		System.out.println("\nWithout return\n");
		generatedBNNoReturn(number);
		in.close();
	}
}
