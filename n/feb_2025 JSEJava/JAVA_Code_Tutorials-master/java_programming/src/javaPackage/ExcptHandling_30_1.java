package javaPackage;

public class ExcptHandling_30_1 {

	
//	private static int a; // for  un-used
//	private static int b;

	@SuppressWarnings("unused")// for un-used
	public static void main(String[] args) {

		// int a = 5 / 0; // arithmetic exception
		// you also by pass by comment line 13 or catch body empty
		// also you cam add arithmetic exception & other exception by using multiple
		// catch
		// NOTE: parent Exception or Throws use

		try {
		int	a = 5 / 0;
		} catch (Exception e) {
			e.printStackTrace(); // to print error varName and .printStrackTrace();
		}
		System.out.println("int 5");

		try {
		int	b = 15 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} /*
			 * catch (ClassNotFoundException e) { e.printStackTrace(); }
			 */
System.out.println();
		System.out.println("b 15, EXCEPTION HANDLING, arithmetic exception");
	}

}
