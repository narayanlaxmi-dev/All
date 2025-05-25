package com.dsa.amarsir;

import java.util.Scanner;

public class Stack_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack_Class obj = new Stack_Class();
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		obj.create_stack(size);
		boolean exit = true;
		int data;
		while (exit) {
			System.out.println("\n----MENU-------\n1 : push \n" + "2 : pop\n" + "3 : peek\n" + "4 : print\n" + "0 : exit\n" + "choose");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				if (!obj.isfull()) {
					System.out.println("Enter data to Push:");
					obj.push(data = sc.nextInt());
					System.out.println("added successfully" + data);
				} else
					System.out.println("Stack Full");
				break;
			case 2:
				if (!obj.isempty()) {
					System.out.println("Removed successfully" +  obj.pop());
				} else
					System.out.println("Stack is empty");
				break;
			case 3:
				if (!obj.isempty())
					System.out.println("Top data is :" + obj.peek());
				else
					System.out.println("Stack is empty");
				break;
			case 4:
				if (!obj.isempty())
					obj.print_stack();

				break;
			case 0:
				System.out.println("Thanks");
				exit = false;
				break;
			default:
				System.out.println("not a falid input, Try Again!!!");
			}

		}
		sc.close();

	}

}
