package javaPackage;

public class Var_16Static {
	
	String a;
	int b;
	static int c=10;
	
	//static method
	public static void a() {
		System.out.println("Hello Static");
	}
	
	public static void main(String[] args) {
		
		//create object from non-static
		Var_16Static v16 = new Var_16Static();
		v16.a = "Selenium "; // Selenium and i pass space
		v16.b = 100;
		a();
		
		System.out.println(v16.a + v16.b + " "+ c);
	}

}
