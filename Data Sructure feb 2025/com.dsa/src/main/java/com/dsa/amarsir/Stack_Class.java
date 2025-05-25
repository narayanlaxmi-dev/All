package com.dsa.amarsir;

public class Stack_Class {
	// data members
	int tos, Maxsize, Stack[];

	void create_stack(int size) {
		Stack = new int[size];
		tos = -1;
		Maxsize = size;
	}

	void push(int e) {
		tos++;
		Stack[tos] = e;
		// Stack[++tos]=e;
	}

	boolean isfull() {
		if (tos == Maxsize - 1)
			return true;
		else
			return false;
	}

	int pop() {
		int temp = Stack[tos];
		tos--;
		return temp;
	}

	boolean isempty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	int peek() {
		int temp = Stack[tos];
		return temp;
	}

	void print_stack() {
		for (int i = tos; i > -1; i--) {
			System.out.println(Stack[i]);
		}
	}
}
