package ass2;

import java.util.Arrays;
import java.util.Scanner;

public class arr1studentAlalysis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];

		System.out.println("enter element of an marks  :");
		for (int i = 0; i < marks.length; i++) {
			System.out.print("insert " + (i + 1) + " :");
			marks[i] = sc.nextInt();
		}
		Arrays.sort(marks);

		int i, lowest, highest;
		float avg = 0;
		System.out.println("--- The Student Marks Analysis ---");
		for (i = 0; i < marks.length; i++) {
			System.out.println("The marks ascending" + i + " : " + marks[i]);
			avg += marks[i];
		}
		System.out.println("\nhigest marks :" + marks[4]);
		System.out.println("lowest marks :" + marks[0]);
		System.out.println("Sum marks " + avg);
		System.out.println("AVERAGE marks :" + (avg / 5));

	}

}
