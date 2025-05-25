package com.dsa.amarsir.day2;

import java.util.Scanner;

public class Priority_Queue_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		priority_Queue obj = new priority_Queue();
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		obj.create_Queue(size);
		boolean exit = true;
		int data;
		while (exit) {
			System.out.println("\n----MENU-------\n1 : Enqueue(add) \n" + "2 : Dequeue(remove)\n" + "3 : Print\n" + "0 : exit\n" + "choose");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				if (!obj.isfull()) {
					System.out.println("Enter data to Push: ");
					obj.enqueue(data=sc.nextInt()); 
					System.out.println("added successfully" + data);
				} else
					System.out.println("Queue Full");
				break;
			case 2:
				if (!obj.isempty()) {
					System.out.println("Removed successfully : " +  obj.dequeue());
				} else
					System.out.println("Queue is empty");
				break;
		
			case 3:
				if (!obj.isempty())
					obj.print_Queue();
				else
					System.out.println("Empty Queue");
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
