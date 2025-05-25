package day3_1practice;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		int unit = 0, totalbill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Unit :");
		unit = sc.nextInt();
		int range = unit / 100;
//		int range = (unit <= 100) ? 0 : (unit <= 300) ? 1 : (unit <= 500) ? 2 : 3;
		switch (range) {
		case 0:
			// range 0 to 100
			totalbill = unit * 5;
			break;

		case 1:

		case 2:
			// range 101 to 300
			totalbill = (100 * 5) + (unit - 100) * 8;
			break;

		case 3:
		case 4:
			// range 301 to 500
			totalbill = (100 * 5) + (200 * 8) + (unit - 300) * 10;
			break;
		default:
			// range above 500
			totalbill = (100 * 5) + (200 * 8) + (300 * 10) + (unit - 500) * 12;

		}
		System.out.println("Total Bill: " + totalbill);
		sc.close();
	}
}
