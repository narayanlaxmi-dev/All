package com.dsa.amarsir.day2;

import java.util.Scanner;

public class Linear_Linked_ListMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Linear_Linked_List obj = new Linear_Linked_List();
		int data;
		boolean exit = true;

		while (exit) {
			System.out.print("\n----MENU-------\n" + "1 : Insert Left");
			System.out.print("\n2 : Delete left");
			System.out.print("\n3 : Insert right");
			System.out.print("\n4 : Delete Right");
			System.out.print("\n5 : Print list");
			System.out.print("\n6 : Search Element list");
			System.out.print("\n7 : Delete specific elements");
			System.out.print("\n8 : Insert After");
			System.out.print("\n9 : Sort");
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
				obj.insert_left(data = sc.nextInt());

				break;
			case 2:
				obj.delete_left();
				break;
			case 3:
				System.out.println("Enter data to insert: ");
				obj.insert_right(data = sc.nextInt());
				break;
			case 4:
				obj.delete_right();
				break;
			case 5:
				obj.print_list();
				

				break;
			case 6:
				System.out.println("Enter data to search list :");
				boolean found = (obj.search_list(data = sc.nextInt()));
				System.out.println(found ? "Element found" : "Not found");
				break;
			case 7:
				System.out.println("Enter data to delete list :");
				obj.delete_element(data = sc.nextInt());
				break;
			case 8:
				System.out.println("Enter refrence to where you wnat to insert : ");
				data = sc.nextInt();
				System.out.println("Enter data :");
				int ref = sc.nextInt();
				obj.insert_after(ref, data);
				break;
			case 9:
				obj.sort_list();
				System.out.println("After sorting");
				obj.print_list();
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}
	}
}
