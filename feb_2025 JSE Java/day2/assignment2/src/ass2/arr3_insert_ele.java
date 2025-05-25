package ass2;

import java.util.Scanner;

public class arr3_insert_ele {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n + 1]; // One extra space for insertion

		System.out.println("Enter " + n + " array elements:");
		for (int i = 0; i < n; i++) { // Fixed loop to avoid index error
			System.out.print("Insert element at index " + i + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter INDEX at which to insert an element: ");
		int idx = sc.nextInt();

		System.out.print("Enter value to insert: ");
		int value = sc.nextInt();

		// reverse n to value decrement and value add i = i--
		for (int i = n; i > idx; i--) {
			arr[i] = arr[i - 1];
		}
		arr[idx] = value;

		System.out.println("Array after insertion:");
		for (int i = 0; i <= n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
