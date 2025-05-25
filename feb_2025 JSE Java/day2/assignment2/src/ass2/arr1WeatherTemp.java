package ass2;

import java.util.Scanner;

public class arr1WeatherTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temperature[] = new int[7];

		System.out.println("enter element of an temperature  :");
		for (int i = 0; i < temperature.length; i++) {
			System.out.print("insert " + (i + 1) + " :");
			temperature[i] = sc.nextInt();
		}
		int max = temperature[0], min = temperature[0], sum = 0;
		boolean isCold = false;
		for (int i = 0; i < temperature.length; i++) {
			if (temperature[i] > max) {
				max = temperature[i];
			}
			if (temperature[i] > min) {
				min = temperature[i];
			}
			sum += temperature[i];
			if (temperature[i] < 10) {
				isCold = true;
			}
		}
		System.out.println("WEATHER average : " + (sum / 7));
		if (isCold)
			System.out.println("The Temp is less 10 degree");

	}

}
