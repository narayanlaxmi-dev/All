package com.dsa.amarsir.day7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseKelementInSeries {

	static void reverseKelement(Integer[] arr, int k) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<>();
		  for (int num : arr) 
//	            queue.offer(num); // true false
			  	queue.add(num);
	        

		for (int i = 0; i < k; i++)
			stack.push(queue.poll());

		// Step 2: Pop elements from the stack and enqueue them back into the queue
		while (!stack.isEmpty())
			queue.offer(stack.pop());

		// Step 3: Dequeue the remaining elements (n-K) and enqueue
		int size = queue.size();
		for (int i = 0; i < size - k; i++)
			queue.offer(queue.poll());
		System.out.println(queue);

	}

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Scanner in = new Scanner(System.in);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter key: ");

		int key = in.nextInt();
		reverseKelement(arr, key);
	}
}
