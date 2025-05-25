package rahulsirDay2;

public interface CurrencyConverter {
	float doConvert(float amount); // properties as abstract method

	float DOLLAR_TO_RUPEE = 80.34f; // properties as final variable
	float POUND_TO_RUPEE = 104.67f;

	default void print() { // only support 8+ version
		System.out.println("Default method executed...");
	}

	static void printMethod() {
		System.out.println("welcome Neyan Converter ");
	}
}
