package com.dsa.amarsir.day2;

public class Queue_Circular {

	// data member
	int front, rear, Maxsize, Queue[], count = 0;

	void create_Queue(int size) {
		Queue = new int[size];
		front = 0;
		rear = -1;
		Maxsize = size;

	}

	void enqueue(int e) {

		if (!isfull()) {
			rear = (rear + 1) % Maxsize;
			Queue[rear] = e;
			count++;
		} else
			System.out.println("Queue is full");

	}

	boolean isfull() {
		if (count == Maxsize)
			return true;
		else
			return false;
	}

	int temp;
	int dequeue() {
		if (!isempty()) {
			 temp = Queue[front];
			front = (front + 1) % Maxsize;
			count--;
			
		} else
			System.out.println("Queue is Empty");
		return temp;
	}

	boolean isempty() {
//			if (front == rear+1)
		return count == 0;
	}

	void print_Queue() {
		if (!isempty()) {
			int c = 0, i = front;
			while (c < count)
			
				System.out.print(Queue[i] + " ");
			i = (i + 1) % Maxsize;
			c++;
		}
		else 
			System.out.println("Queue is Empty");
	}

}
