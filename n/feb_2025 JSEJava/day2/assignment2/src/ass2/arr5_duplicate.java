package ass2;

import java.util.Scanner;

public class arr5_duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		int i, j;
		System.out.println("Enter " + n + " array elements:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int duplicate = 0; // Reset before counting
		System.out.println("Duplicate elements:");

		for (i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;

			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true; // Found a duplicate
				}
			}

			if (isDuplicate) {
				System.out.println(arr[i]);
				duplicate++;
			}
		}
	}

}
