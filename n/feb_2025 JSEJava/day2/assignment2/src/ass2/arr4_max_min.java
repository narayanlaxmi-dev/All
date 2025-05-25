package ass2;

import java.util.Scanner;

public class arr4_max_min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter " + n + " array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int i, max = arr[0], min = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("maximum value is : " + max);
		System.out.println("minimum value is : " + min);
	}
}
