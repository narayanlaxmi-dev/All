package ass2;

public class arr5table {

	public static void main(String[] args) {
		// tables 1 to 5
		for (int i = 1; i <= 5; i++) {
			System.out.println("Multiplication Table for " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println(); // blank line
		}

	}
}
