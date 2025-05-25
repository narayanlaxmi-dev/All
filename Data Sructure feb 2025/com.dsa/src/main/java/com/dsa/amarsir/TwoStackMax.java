package com.dsa.amarsir;

import java.util.Scanner;

public class TwoStackMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size, data;
		Stack_Class obj = new Stack_Class();
		Stack_Class maxObj = new Stack_Class();
		System.out.println("Enter size of array:");
		size = in.nextInt();
		obj.create_stack(size);
		maxObj.create_stack(size);
		boolean exit = true;

		while (exit) {
			System.out.println("\n--------");
			System.out.println("1: push");
			System.out.println("2: pop");
			System.out.println("3: peek");
			System.out.println("4: print all element");
			System.out.println("0: Exit");
			System.out.println("Choice: ");
			int ch = in.nextInt();

			switch (ch) {
			case 1:
				if (obj.isfull())
					System.out.println("Stack is Full.");
				else {
					System.out.print("Enter Data To Push: ");
					data = in.nextInt();
					obj.push(data);

					if (maxObj.isempty() || data > maxObj.peek())
						maxObj.push(data);

					System.out.println("Pushed Successfully.");
				}
				break;

			case 2:
				if (obj.isempty())
					System.out.println("Stack is Empty");
				else {
					int popped = obj.pop();
					if (popped == maxObj.peek()) {
						System.out.println("Stack Element Pop: " + maxObj.pop());
					}
					System.out.println("Stack Element Pop: " + popped);

				}
				break;

			case 3:
				if (obj.isempty())
					System.out.println("Stack is Empty");
				else {
					System.out.println("Top element: " + obj.peek());
					System.out.println("Top element in MaxStack: " + maxObj.peek());
				}
				break;

			case 0:
				System.out.println("Exiting.........");
				exit = false;
				break;

			case 4:
				if (obj.isempty())
					System.out.println("Stack is Empty");
				else
					obj.print_stack();
				break;

			}
		}
	}
}
