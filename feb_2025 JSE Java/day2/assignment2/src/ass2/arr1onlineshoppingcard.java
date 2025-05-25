package ass2;

import java.util.Scanner;

public class arr1onlineshoppingcard {

	public static void main(String[] args) {
		String items[] = { "pizza", "pasta", "burger", "Tea" };
		int price[] = { 250, 120, 200, 50 };
		float total_price = 0;

		int ch, count = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------------------------");
			System.out.println("---Pizza Menu Driven ---");
			System.out.println("1 - pizza  🍕 $250"); // emoji window + >
			System.out.println("2 - Burger 🍔 $120");
			System.out.println("3 - Pasta  🍝 $200");
			System.out.println("4 - TEA    🍵 $50");
			System.out.println("5 - Generate Bill & exit");
			System.out.println("Enter choice :");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				count++;
				total_price += price[0];
				System.out.println("1 Pizza added ....");
				break;

			case 2:
				count++;
				total_price += price[1];
				System.out.println("1 Burger added ....");
				break;

			case 3:
				count++;
				total_price += price[2];
				System.out.println("1 Pasta added ....");
				break;

			case 4:
				count++;
				total_price += price[3];
				System.out.println("1 TEA added ....");
				break;
			case 5:
				if (count > 3) {
					total_price -= total_price * 0.1; // 10 percent discount if item is 3
					System.out.println("---> " + total_price);
				}

				else
					System.out.println("---> " + total_price);
				System.out.println("Generating bill and exiting...");
				System.out.println("Total Bill: " + total_price);
				break;
			default:
				System.out.println("INVALID PARAMETER!!!");
			}

		} while (ch != 5);
	}

}
