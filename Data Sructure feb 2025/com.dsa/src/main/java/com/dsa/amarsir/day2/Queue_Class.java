package com.dsa.amarsir.day2;

public class Queue_Class {
	// data member
	int front, rear, Maxsize, Queue[];

	void create_Queue(int size) {
		Queue = new int[size];
		front = 0;
		rear = -1;
		Maxsize = size;
	}

	void enqueue(int e) {
		Queue[++rear] = e;

	}

	boolean isfull() {
		if (rear == Maxsize - 1)
			return true;
		else
			return false;
	}

	int dequeue() {
		int temp = Queue[front++];
		return temp;
	}

	boolean isempty() {
//		if (front == rear+1)
		if (front > rear)
			return true;
		else
			return false;
	}

	void print_Queue() {
		for (int i = front; i <=rear; i++) {
			System.out.print(Queue[i]+" ");
		}
	}
}
