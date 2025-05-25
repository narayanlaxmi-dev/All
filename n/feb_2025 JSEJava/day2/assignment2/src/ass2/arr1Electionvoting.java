package ass2;

import java.util.Scanner;

public class arr1Electionvoting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vote[] = new int[3]; // 3 candidate

		int choice;
		for (int i = 0; i < 5; i++) {// 5 time cast vote
			System.out.println("5 times Cast your Vote...");
			System.out.println("1 BJP \t2 INC \t3 AAP");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				vote[0]++; // array initalize 0 then increment
				break;
			case 2:
				vote[1]++;
				break;
			case 3:
				vote[2]++;
				break;
			default:
				System.out.println("invalid input try again...");
			}
		}
		System.out.println("----------------------------");
		System.out.println("1 BJP total votes" + vote[0]);
		System.out.println("2 INC total votes" + vote[1]);
		System.out.println("3 AAP total votes" + vote[2]);
		System.out.println("----------------------------");

		if (vote[0] > vote[1] && vote[0] > vote[2])
			System.out.println("BJP Winner....");

		else if (vote[1] > vote[0] && vote[1] > vote[2])
			System.out.println("INC Winner....");

		else if (vote[2] > vote[0] && vote[2] > vote[1])
			System.out.println("APP Winner");
		else
			System.out.println("TIE OF equal vote.....");
	}

}
