package Reflection;

// predefine class in api collection
public class ReflectionExampleMain {

	public static void main(String[] args) {
//		 1 method
		Class<Integer> class1 = Integer.class; // create an object of class

//		 2 method
		Class class2 = null;
		try {
			// forName() method is used to load class explicity
			class2 = Class.forName("java.lang.String"); // checked exception if relevent class not found
														// classNotFoundException
		} catch (ClassNotFoundException e) {
			e.getStackTrace();
		}

//		 3 method
		Float pivalue = 3.145619f;
		Class class3 = pivalue.getClass();
		System.out.println("1st class :-" + class1.getName());
		System.out.println("2st class :-" + class2.getName());
		System.out.println("3st class :-" + class3.getName());
	}

}
