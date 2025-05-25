package Assignment;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c4 = new Calculator(10000, 10);

		System.out.println("Addition " + Calculator.add(90, 0));
		System.out.println("subtraction " + Calculator.sub(0, 4));
		System.out.println("multiion " + Calculator.mult(10, 4));
		System.out.println("Division " + c4.div()); // non static method

	}

}
