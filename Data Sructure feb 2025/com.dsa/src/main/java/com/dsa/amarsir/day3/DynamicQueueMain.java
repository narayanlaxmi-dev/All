package com.dsa.amarsir.day3;

import java.util.Scanner;

public class DynamicQueueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DynamicQueue obj = new DynamicQueue();

		boolean exit = true;
		int data;
		while (exit) {
			System.out.println("\n----MENU-------\n1 : Enqueue(add) \n" + "2 : Dequeue(remove)\n" + "3 : Print\n"
					+ "0 : exit\n" + "choose");
			int ch = sc.nextInt();

			switch (ch) {
			case 0:
				System.out.println("Exiting...");
				exit = false;
				break;
			case 1:
				System.out.println("Enter data to insert: ");
				obj.enqueue(data = sc.nextInt());

				break;
			case 2:
				obj.deQueue();
				break;
			case 3:
				obj.print_Queue();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		}
		sc.close();

	}

}
