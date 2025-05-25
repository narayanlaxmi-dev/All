package Lession27_;

//constructor 1
public class Constructor_27_1 {

	// by Default const
	Constructor_27_1() { // by DEFAULT non- parameter constructor method
		System.out.println("hello i am default constructor in 27_1");
	}

	public static void a() {
		System.out.println("static method");
	}

	public static void main(String[] args) {

		// create obj for call non static
		Constructor_27_1 co1 = new Constructor_27_1(); // by default calling default const
//		co1.a(); or/
		extracted(co1); // used extracted method
		Constructor_27_1.a(); // or/
		// co1.a(); // unappropriate method
	}

	private static void extracted(Constructor_27_1 co1) {
//		co1.a();
	}

}
