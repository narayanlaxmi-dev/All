package ass2;

import java.util.Arrays;
import java.util.Scanner;

public class arr9max_product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ARRAY SIZE :");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("enter element of an array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("insert " + i + " :");
			arr[i] = sc.nextInt();
		}

		int max = 0, secondmax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];

			} else if (arr[i] > secondmax) {
				secondmax = arr[i];
			}
		}
		System.out.println("max value is" + max);
		System.out.println("second max value is " + secondmax);
		System.out.println("multiplication " + (max * secondmax));

		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1] * arr[arr.length - 2]);
	}

}
