package assignment8;

import java.util.Scanner;

public class CardinalDirectionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter direction:");
		String dir = sc.next();
		dir = dir.toUpperCase();
		Directions currDir = Directions.valueOf(dir);

		try {
			Directions oppositeDirection = currDir.oppositeDirection();
			System.out.println("Currrent direction are: " + currDir);
			System.out.println("Oppostie direction are: " + oppositeDirection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
