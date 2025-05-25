package ass2;

import java.util.Scanner;

public class arr6_common_2arr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int arr2[] = new int[n];
		int i, j;
		System.out.println("Enter array 1 element " + n + " array elements:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter array  2 element " + n + " array elements:");
		for (i = 0; i < arr.length; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.println("Duplicate elements:");

		for (i = 0; i < arr.length; i++) {

			for (j = 0; j < arr.length; j++) {
				if (arr[i] == arr2[j]) {

					System.out.println(arr[i]);
				}
			}
		}
	}
}
