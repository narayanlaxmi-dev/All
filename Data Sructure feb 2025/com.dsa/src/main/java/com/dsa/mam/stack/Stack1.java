package com.dsa.mam.stack;

import java.util.Scanner;

public class Stack1 {

	int stackRepresentation[], MaxSize, top = -1;

	public void createStack(int s) {
		top = -1;
		MaxSize = s;
		stackRepresentation = new int[MaxSize];
	}

	public void push(int element) {
		top++;
		stackRepresentation[top] = element;
	}

	public boolean isFull() {
		if (top == MaxSize - 1)
			return true;
		return false;
	}

	public boolean isEmpty() {
//		return top < 0;
		if (top == -1)
			return true;
		return false;
	}

	public int size() {
		return top + 1;
	}

	public int pop() {
		int temp = stackRepresentation[top];
		top--;
		return (temp);
	}

	public int peek() {
		return stackRepresentation[top];
	}

	public void print() {
		for (int i = top; i > -1; i--)
			System.out.println(stackRepresentation[i]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack1 obj = new Stack1();
		System.out.println("Enter Stack Size:");
		int size = sc.nextInt();
		@SuppressWarnings("unused")
		int data = 0;
		obj.createStack(size);
		boolean exit = true;

		while (exit) {
			System.out.println("\n-------------------\n" + "1 : push\n" + "2 : pop\n" + "3 : peek\n" + "4 : print\n"
					+ "5 : isFull\n" + "6 : isEmplty\n" + "0 : Exit\n" + "Choose: ");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (!obj.isFull()) {
					System.out.println("Enter data to Push/Add: ");
					obj.push(data = sc.nextInt());
					System.out.println("Data added successfully...");
				} else
					System.out.println("You Reach max level, OVERFLOW.");
				break;
			case 2:
				if (!obj.isEmpty()) {
					int remove = obj.pop();
					System.out.println("Data remove successfully, remove element is:" + remove);
				} else
					System.out.println("UnderFlow Data.");
				break;

			case 3:
				if (!obj.isEmpty())
					System.out.println("Top most element is:" + obj.peek());
				else
					System.out.println("UnderFlow Data.");
				break;
			case 4:
				if (obj.size() > 1) {
					System.out.println("The Stack is Printed\n");
					obj.print();
				} else
					System.out.println("NOT PRINT");
				break;

			case 5:
				System.out.println("The Stack is Full: " + obj.isFull());
				break;

			case 6:
				System.out.println("The Stack is Empty: " + obj.isEmpty());
				break;

			case 0:
				System.out.println("thanks to see stack operation..\nexiting....");
				exit = false;
				break;
			default:
				System.out.println("not a falid input, Try Again!!!");
			}
		}
		sc.close();
	}
}
