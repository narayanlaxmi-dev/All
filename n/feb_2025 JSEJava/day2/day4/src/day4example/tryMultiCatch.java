package day4example;

import java.util.Scanner;

public class tryMultiCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, ans;
		int arr[] = { 20, 02, 32 };

		try {
			System.out.println("Enter number 1:");
			a = sc.nextInt();
			System.out.println("Enter number 2:");
			b = sc.nextInt();
			ans = a / b;
			System.out.println("Division =" + ans);
			ans = arr[0] / b;
			System.out.println("Array divide =" + ans);
		} catch (ArithmeticException ae) {
			System.out.println("arith exception :" + ae);
		} catch (ArrayIndexOutOfBoundsException aiofb) {
			System.out.println("Array error : " + aiofb);
		} catch (Exception aiofb) {
			System.out.println("EXCEPTION : " + aiofb.getMessage());
		} finally {
			System.out.println("finally execute not check try or catch");
			sc.close();
		}
	}
}
