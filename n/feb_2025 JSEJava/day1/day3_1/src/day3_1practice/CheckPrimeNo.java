package day3_1practice;

public class CheckPrimeNo {

	public static void main(String[] args) {
		boolean bool = true;
		int n = 7;// number

		if (n == 1) {
			bool = false;
			System.out.println("NOT prime.");
		} else {
			int i = 2;
			while (i < n) {// or // i < n/2
				if (n % i == 0) {
					bool = false;
					break;
				}
				i++;
			}
			if (bool) {
				System.out.println("prime");
			} else
				System.out.println("NOT prime...");
		}
	}
}
