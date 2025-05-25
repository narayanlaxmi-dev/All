package rahulsirDay2;

public class OuterClass {

	private String greet = "Welcome";
	private static String message = "as long as i live there are infinite chances";

	// local inside method inner -------------------------3
	public void print() { // locally declared print() method
		class localClass {
			private void printLocal() {
				System.out.println("local class inside method" + message + " non stat:" + greet);

			}
		}
		localClass lobj = new localClass();
		lobj.printLocal();

	}

	// static inner -----------------------------------------1
	public static class StaticInner {
		public void print() { // create object of inner class because print is not static method
			System.out.println(message);
//			System.out.println(greet); // only access static meb var
		}

		public static void printstat() {
			System.out.println("static method static class :" + message);
		}
	}

	// nested class non static inner -------------------------2
	public class Nested {
		public void print() {
			System.out.println(" stat var :" + message);
			System.out.println("non stat var :" + greet);
		}

		public static void printstat() {
			// System.out.println(greet); // cant call non static var
			System.out.println("static method nested class: " + message);
		}
	}

	// Anonymous inner class -------------------------4
	// suggestion to creater instance obj and ctrl + space suggestion overridden in
	// main

}
