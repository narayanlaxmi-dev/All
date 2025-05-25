package com.dsa.amarsir.day3.assignment;

import java.util.Scanner;

import com.dsa.amarsir.day2.Linear_Linked_List;

public class EmployeeLinkedListMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		logicEmployeeLinkedlist obj = new logicEmployeeLinkedlist();

		boolean exit = true;

		while (exit) {
			System.out.print("\n----MENU-------\n" + "1 : register Employee");
			System.out.print("\n2 : Search by ID");
			System.out.print("\n3 : Update by ID");
			System.out.print("\n4 : Delete by ID");
			System.out.print("\n5 : Print list");
			System.out.print("\n0 : Exit");
			System.out.print("\nChoice :");
			int ch = sc.nextInt();

			switch (ch) {
			case 0:
				System.out.println("Exiting...");
				exit = false;
				break;

			case 1:
				System.out.println("Enter employeeID, String name, String gender, String position, double salary");
				Employee e = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
				obj.registration(e);
				break;

			case 2:
				System.out.println("Enter ID for Data is Present:");
				obj.search_EmployeeById(sc.nextInt());
				break;

			case 3:
				System.out.println("Enter ID to update:");
				obj.updateById(sc.nextInt());
				break;

			case 4:
				System.out.println("Enter ID to delete:");
				obj.deleteById(sc.nextInt());
				break;

			case 5:
				System.out.println("Print All");
				obj.PrintAllElement();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}
	}
}
