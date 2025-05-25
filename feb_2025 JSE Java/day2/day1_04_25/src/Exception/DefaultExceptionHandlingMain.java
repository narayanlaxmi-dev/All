package Exception;

// how to send commangline argument in eclipse 
public class DefaultExceptionHandlingMain {

	public static void main(String[] args) {
		// A prog to accept 2 number command line arguments and print their divide

		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			int result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
		} catch (ArrayIndexOutOfBoundsException obj) { // unchecked Exception
			System.out.println(" Enter 2 number bhai " + obj);
		} catch (ArithmeticException obj) { // unchecked Exception
			System.out.println(" 2 value 0 se divide nai hoga bhai " + obj);

			// parent block is apper in last onlys
		} catch (Exception obj) {
			System.out.println(" Default " + obj);
		} catch (Throwable obj) {
			System.out.println(" Throwable " + obj);
		}
	}

}