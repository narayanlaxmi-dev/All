package Assignment;

import java.util.Scanner;

public class ArrayIndexBounds {

	public static void main(String[] args) {
		System.out.println("Enter size of an array : ");
		Scanner sc = new Scanner(System.in);
		int size;
		try {
			size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter numberof elements ");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("EnteR INDEX location:  ");
			int loc = sc.nextInt();

			System.err.println(arr[loc]);
		} catch (ArrayIndexOutOfBoundsException ae) {

			System.out.println("Array index Error   error:-" + ae.getMessage());
			sc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
