package com.dsa.amarsir.day3;

import com.dsa.amarsir.day2.Node;

public class StackusingLinkedList {
	Node tos;// never lose it or else all lost

	void push(int data) {
		Node n = new Node(data);// 1
		if (tos == null)// not created
			tos = n;// tos is assigned not created ,it is first from either side
		else {
			n.next = tos;// 1
			tos = n;
		}
	}

	void pop() {
		if (tos == null)// not created
			System.out.println("\nEmpty List");
		else {
			Node t = tos;// 1
			tos = tos.next;// 2
			System.out.print(t.data + " deleted");
		}
	}

	int peek() {
		return tos.data;
	}

	void print_list() {
		if (tos == null)// not created
			System.out.println("\nEmpty List");
		else {
			Node t = tos;
			while (t != null) {
				System.out.println(t.data);
				t = t.next;
			}
		}
	}
}
