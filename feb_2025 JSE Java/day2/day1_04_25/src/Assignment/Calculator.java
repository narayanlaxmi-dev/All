package Assignment;

public class Calculator {
	private int num1, num2;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Addition
	public static float add(int num1, int num2) {
		try {
			if (num1 < 0 || num2 < 0)
				throw new ArithmeticException("Addition not possible with negative number");

			else
				return num1 + num2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// subtraction
	public static float sub(int num1, int num2) {
		try {
			if (num1 < 0 || num2 < 0)
				throw new ArithmeticException("Sub not possible Bhai for negative number");
			else
				return num1 - num2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;

	}

	// multiplication
	public static float mult(int num1, int num2) {
		try {
			if (num1 == 0 || num2 == 0)
				throw new ArithmeticException("MULT not BHAI FOR 0 YAR");
			else
				return num1 * num2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// division
	public  float div() {
		try {
			if (num2 != 0)
				return num1 / num2;
			else
				throw new ArithmeticException("Bhai second number 0 not possible");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
