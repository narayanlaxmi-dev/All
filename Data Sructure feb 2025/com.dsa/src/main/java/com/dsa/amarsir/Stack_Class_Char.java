package com.dsa.amarsir;

public class Stack_Class_Char {
	// data members
	int tos, Maxsize;
	char Stack[];

	void create_stack(int size) {
		Stack = new char[size];
		tos = -1;
		Maxsize = size;
	}

	void push(char e) {
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

	char pop() {
		char temp = Stack[tos];
		tos--;
		return temp;
	}

	boolean isempty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	char peek() {
		char temp = Stack[tos];
		return temp;
	}

	void print_stack() {
		for (int i = tos; i > -1; i--) {
			System.out.println(Stack[i]);
		}
	}
}
