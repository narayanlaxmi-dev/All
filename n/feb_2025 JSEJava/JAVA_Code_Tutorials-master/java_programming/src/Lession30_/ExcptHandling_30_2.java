package Lession30_;

public class ExcptHandling_30_2 {

	public static void main(String[] args) {

		String s = null;

		try {
			System.out.println(extracted(s).length()); // extread method add for un used
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("s.length(), EXCEPTION HANDLING, null pointer exception");
	}

	private static String extracted(String s) {
		return s;
	}

}
