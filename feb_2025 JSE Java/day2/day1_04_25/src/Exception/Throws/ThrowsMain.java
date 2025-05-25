package Exception.Throws;

public class ThrowsMain {
	private static void doTest() throws Exception {
		// this method want to intimate compiler that it may throw an exception but not
		// willing to handle it, Its caller must handle it
		System.out.println("doTest called..........");
	}

	private static void beginTest() {
		// this method want to invoke doTest(), That this method is caller to doTest()

		try {// this method handled exception
			doTest();
			startTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void startTest() throws Exception { // common Exception handling
		// this method want to invoke doTest(), That this method is caller to doTest()
		// this method doesnot handle exception to caller handle it
		doTest();
		System.out.println("Start test called......");
	}

	private static void UnchekedTest() { 
		System.out.println(" Unchecked no need to throw not applicable....");
	}
	
	public static void main(String[] args) { // not used in throw excetion not suggested
		beginTest();
		System.out.println("in main");
		try {
			startTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		UnchekedTest();
	}

}
