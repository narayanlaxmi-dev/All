package javaPackage;

public class Var_11RelationalOp {

	public static void main(String[] args) {
		
		int a=500;
		int b=500;
		//  you can write == or != for your logic 
		if (a != b) {
			System.out.println("a is NOT equal to b");
		} else {
			System.out.println("a is equal to b");
		}
		
		String p = "NARAYANA";
		String q = "narayana";
		
		// compare == 1, case
		if (p == q) {
			System.out.println("Boths are equals");
		} else {
			System.out.println("p & q not are equals");
		}
		
		// compare .equals() method, 2 case
		if (p.equals(q)) {
			System.out.println("Boths are equals");
		} else {
			System.out.println("p & q not are equals");
		}
		
		// compare .equalsIgnoreCase() method, 3 case
		if (p.equalsIgnoreCase(q)) {
			System.out.println("Boths are equals");
		} else {
			System.out.println("p & q not are equals");
		}

	}
	
}
