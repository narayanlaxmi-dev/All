package pattern;

public class pattern1 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}

		System.out.println("---------------------------------------------------------\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(i);
			}
			System.out.println("\n");
		}

		System.out.println("---------------------------------------------------------\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println("\n");
		}

		System.out.println("---------------------------------------------------------\n");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

		System.out.println("---------------------------------------------------------\n");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

		System.out.println("---------------------------------------------------------\n");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

		System.out.println("---------------------------------------------------------\n");

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		System.out.println("---------------------------------------------------------\n");
		int m = 5;
		for (int i = 0; i <= 5; i++) {
			for (int k = m; k >= 1; k--) {
				System.out.print(" ");
			}
			m--;
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		System.out.println("---------------------------------------------------------\n");
		int x = 5;
		for (int i = 0; i <= 5; i++) {
			for (int k = x; k >= 1; k--) {
				System.out.print(" ");
			}
			x--;
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		System.out.println("---------------------------------------------------------\n");
		
		
		
	}
}
