package com.dsa.amarsir.day7;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {

	Stack<Integer> stack = new Stack<>();
	int capacity = 10;

	void push(int e) {
		if (!isFull()) {
			stack.push(e);
		} else {
			System.out.println("Stack is full!");
		}
	}

	int pop() {
		if (!isEmpty()) {
			return stack.pop();
		} else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}

	boolean isEmpty() {
		return stack.isEmpty();
	}

	boolean isFull() {
		return stack.size() == capacity;
	}

	int peek() {
		if (!isEmpty()) {
			return stack.peek();
		} else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}

	int searchStack(int element) {
		return stack.search(element); // Returns 1-based position or -1
	}

	void printStack() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
		} else {
			System.out.println("Stack contents:");
			// NO LIFO
//			for (Integer item : stack) 
//				System.out.println(item);
			// NO LIFO TO String print
//			System.out.println(stack);
			for (int i = stack.size() - 1; i > -1; i--)// LIFO Print
				System.out.println(stack.get(i));

		}
	}

	public static void main(String[] args) {
		boolean exit = true;
		StackExample obj = new StackExample();
		Scanner in = new Scanner(System.in);

		while (exit) {
			System.out.println("\n--- STACK MENU ---");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Search");
			System.out.println("4. Peek");
			System.out.println("5. Print");
			System.out.println("0. Exit");
			System.out.print("Choose: ");

			int ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter element to push: ");
				int val = in.nextInt();
				obj.push(val);
				break;
			case 2:
				int popped = obj.pop();
				if (popped != -1)
					System.out.println("Popped: " + popped);
				break;
			case 3:
				System.out.print("Enter element to search: ");
				int key = in.nextInt();
				int pos = obj.searchStack(key);
				if (pos == -1)
					System.out.println("Element not found.");
				else
					System.out.println("Found at position: " + pos);
				break;
			case 4:
				int top = obj.peek();
				if (top != -1)
					System.out.println("Top element: " + top);
				break;
			case 5:
				obj.printStack();
				break;
			case 0:
				System.out.println("Exiting...");
				exit = false;
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}

		in.close();
	}
}
