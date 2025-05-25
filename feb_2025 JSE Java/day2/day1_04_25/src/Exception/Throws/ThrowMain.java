package Exception.Throws;

public class ThrowMain {

	public static int divide(int x, int y) {
		if (y == 0) {
			// runtime exeption
			RuntimeException r = new RuntimeException("bhai second value not a  zero...");
			throw r; // forcefully / explicity throw exception
		}
		return x / y;
	}

	public static void main(String[] args) {
		int divide = divide(22, 0);
		System.out.println(divide);
	}

}
