package com.dsa.amarsir.day3;

import java.util.Scanner;

import com.dsa.amarsir.day2.Linear_Linked_List;

public class StackusingLinkedListMain {
	public static void main(String[] args) {
		StackusingLinkedList obj = new StackusingLinkedList();
		Scanner sc = new Scanner(System.in);
		int data;
		boolean exit = true;

		while (exit) {
			System.out.print("\n----MENU-------\n" + "1 : push");
			System.out.print("\n2 : pop");
			System.out.print("\n3 : Peek ");
			System.out.print("\n4 : Print ");
			System.out.print("\n0 : Exit");
			System.out.print("\nChoice :");
			int ch = sc.nextInt();

			switch (ch) {
			case 0:
				System.out.println("Exiting...");
				exit = false;
				break;
			case 1:
				System.out.println("Enter data to insert: ");
				obj.push(data = sc.nextInt());

				break;
			case 2:
				obj.pop();
				break;
			case 3:

				System.out.println(obj.peek());
				break;
			case 4:

				obj.print_list();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}
	}
}
