package ass2;

import java.util.Scanner;

public class arr7sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i, j;
		System.out.println("Enter array 1 element " + n + " array elements:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter number to find pair");
		int number = sc.nextInt();
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (number == arr[i] + arr[j]) {
					System.out.println(number + " := " + arr[i] + " + " + arr[j]);
				}
			}
		}
	}

}
