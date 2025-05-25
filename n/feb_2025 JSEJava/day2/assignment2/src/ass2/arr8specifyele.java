package ass2;

import java.util.Scanner;

public class arr8specifyele {

	public static void main(String[] args) {
		// 65 77 specific element search in array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ARRAY SIZE :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		boolean has65 = false;
		boolean has77 = false;
		System.out.println("enter element of an array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("insert " + i + " :");
			arr[i] = sc.nextInt();
		}
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == 65)
				has65 = true;
			if (arr[i] == 77)
				has77 = true;
		}

		if (has65 && has77)
			System.out.println("65 and 77 found !!!!");
		else if (has65)
			System.out.println("65 found !!!!");
		else if (has77)
			System.out.println("77 found !!!!");
		else
			System.out.println("NOT found........");
	}

}
