package AllPair;

import java.lang.reflect.Array;
import java.util.Scanner;

public class findAllPairs {

	public static void main(String[] args) {
		int n;
		System.out.println("enter array size");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Array arr[] = new Array[n];

		System.out.println("Enter specific number to check addition");
		int number = sc.nextInt();
		// find all pairs element array those sum is equal
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int num;
				if (arr[i] + arr[j] == number) {

				}

			}
		}
	}
}
