package com.dsa.amarsir.day7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class QueueCollection {
	Queue<Integer> queue = new LinkedList<Integer>(); //

	void enQueue(int data) {
		queue.add(data);
	}

	void deQueue() {
		if (queue == null)// not created
			System.out.println("\nEmpty List");
		else {
			queue.poll();
			System.out.println("Element Deleted Successfully.");
		}
	}

	void print_likedlist() {

		if (queue == null)
			System.out.println("LinkedList empty");
		else {
			for (Integer q : queue) 
				System.out.print(" | " + q + " |->");
		
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueueCollection obj = new QueueCollection();
		
		boolean exit = true;

		while (exit) {
			System.out.print("\n----MENU-------\n" + "1 : Enqueue");
			System.out.print("\n2 : Dequeue");
			System.out.print("\n3 : Print");
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
				obj.enQueue(sc.nextInt());

				break;
			case 2:
				obj.deQueue();
				
				break;

			case 3:
				obj.print_likedlist();
			}
			sc.close();
		}
	}

}
