package com.dsa.amarsir.day3;

import com.dsa.amarsir.day2.Node;

public class DynamicQueue {
	Node front, rear;// never lose it or else all lost



	void deQueue() {
		if (front == null) {// not created
			System.out.println("\nEmpty List");
		} else {
			Node t = front;// 1
			if (front == rear)
				front = rear = null;
			else {
				front = front.next;// 2
				rear.next = front; // 3
				System.out.print(t.data + " deleted");
			}
		}
	}

	void enqueue(int data) {
		Node n = new Node(data);// 1
		if (front == null) {// not created
			front = n;// front is assigned not created ,it is first from either side
			rear = n;
			rear.next = front;

		} else {
			Node t = front;// 1
			rear.next = n;
			rear = n;
			rear.next = front;

			while (t.next != null)// 2
				t = t.next;

			t.next = n;// 3
		}
	}

	
	void print_Queue() {
		if (front == rear)// not created
			System.out.println("\nEmpty List");
		else {
			Node t = front;
			do {
				System.out.print("|" + t.data + "| -> ");
				t = t.next;
			} while (t != front);

		}
	}
}
