package javaPackage;

public class Var_12Static1 {
	
	int a = 10;
	String b = "Narayana";
	static int c = 100;
	
	//Static method1 
	public static void method1() {
		String B = "Laxmi";
		System.out.println(B);
	}
	
	//Non-Static method2
	public void method2() {
		int A = 100;
		System.out.println(A);
		method1();               // because i calling again method1 so laxmi printed
	}
	
	// If i have to run this O/P so Create main method
	public static void main(String[] args) {
		//static
		method1(); // Static method run, Simply type method Name
		
		//Non-Static
		Var_12Static1 v12 = new Var_12Static1(); // we have to create Object to run non-static
		v12.method2(); // object name and .methodName();                                      o/p 100  --- Laxmi
		System.out.println(v12.b); // print any var so syso objectName.variableName();        o/p Narayana
		
	}

}
