package Exception;

// how to send commangline argument in eclipse 
public class MultipleExceptionHandlingMain2 {

	public static void main(String[] args) {
		// A prog to accept 2 number command line arguments and print their divide

		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			int result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
		} /*
			 * catch (ArrayIndexOutOfBoundsException obj) { // unchecked Exception
			 * System.out.println(" Enter 2 number bhai " + obj); } catch
			 * (ArithmeticException obj) { // unchecked Exception
			 * System.out.println(" 2 value 0 se divide nai hoga bhai " + obj); }
			 */

		// rule : exception class used in catch block must not be in parent child
		// relation
		catch (ArrayIndexOutOfBoundsException | ArithmeticException obj) { // not allowed checked | unchecked

			if (obj instanceof ArrayIndexOutOfBoundsException)
				System.out.println(" Enter 2 number bhai ");
			else
				System.out.println(" 2 value 0 se divide nai hoga bhai ");

			System.out.println(obj);
		}
	}

}

// java no ... 10 20 .... 10=arg[0] and so on
// right click run as run configuration
//main section argument program argument and enter value apply and run 