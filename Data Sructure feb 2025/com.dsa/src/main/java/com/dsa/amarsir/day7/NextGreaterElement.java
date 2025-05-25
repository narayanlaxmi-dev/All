package com.dsa.amarsir.day7;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Integer[] arr = { 4, 5, 2, 10, 8 };
		Integer[] sol = new Integer[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i])
				stack.pop();

			sol[i] = !stack.isEmpty() ? stack.peek() : -1;
//			sol[i] = stack.isEmpty() ? -1 : stack.peek();

			stack.push(arr[i]);
		}

	
//		for (int a : sol)
//			System.out.print(a + " ");
		System.out.println(Arrays.toString(arr));
		System.out.println("NEXT GREATER ELEMENT:"+ Arrays.toString(sol));

	}
}