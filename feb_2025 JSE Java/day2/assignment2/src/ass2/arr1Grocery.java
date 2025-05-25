package ass2;

import java.util.Arrays;
import java.util.Scanner;

public class arr1Grocery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String groc[] = { "apple", "mango", "grapes", "watermallon" };
		boolean isAvailable = false;
//		Arrays.toString(groc);
		System.out.println("=--->" + Arrays.toString(groc));
		System.out.println("Enter what item you want :");
		String it = sc.nextLine();
		for (int i = 0; i < groc.length; i++) {
			if (groc[i].equals(it)) { // check available or not in string array
				isAvailable = true;
				break;
			}

		}

		if (isAvailable)
			System.out.println("available ...");
		else
			System.out.println("NOT available ...");

		// right click source toString generate
		System.out.println(it.toString());
	}

}
