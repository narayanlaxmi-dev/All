package ass2;

// write a prog test array contain specific value return
// the index of an array element
import java.util.Scanner;

public class arr2_dynamic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size :");
		int n = sc.nextInt();
		int arr[] = new int[n]; // new is keyword allocated dynamic memory
		int ch, i, flag = 0;

		System.out.println("Enter total array elements " + n + " :");
		for (i = 0; i < arr.length; i++) {
			System.out.print("insert index " + i + " :");
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element to find an array :");
		ch = sc.nextInt();
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				flag = 1;
				break;
			}
		}

		if (flag == 1)
			System.out.println("The index find at --->" + i + "\nvalue is --->" + arr[i]);
		else
			System.out.println("not found...");

	}

}
