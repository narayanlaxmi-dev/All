package com.dsa.amarsir.day2;

import java.util.Scanner;

public class Sliding_Window_Problem {

	static int[] solution(int queue[], int window_size) {

		int sol[] = new int[queue.length- window_size];

		for (int i = 0; i < queue.length - window_size; i++) {

			int min = queue[i];// ref
			for (int j = i; j < i + window_size; j++) {
				if (queue[j] > min)
					min = queue[j];

			}
			sol[i] = min;
		}
		return sol;

	}

	public static void main(String args[]) {
		int queue[] = { 3, 1, 6, 8, 11, 22, 9, 55, 6, 11, 88, 33, 22, 54 };
		System.out.println("Size:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int sol[] = solution(queue, size);
		for (int i = 0; i < sol.length ; i++) {
			System.out.print(sol[i] + " ");
		}
		in.close();
	}
}
