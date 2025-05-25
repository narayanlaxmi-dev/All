package javaPackage;

public class Var_5Static_NonStaticVarMethod {
	
	int a = 1; // non-static GLOBAL variable value 
	static int A = 2; // static variable value

	public static void main(String[] args) {
		int a = 11; // class a=1 && method a=11 is different
		System.out.println(a);
		
		//static method calling
		System.out.println(A); // Static A variable value------or
		System.out.println(Var_5Static_NonStaticVarMethod.A); // Static A variable value
		d(); // Static method z local variable--------or
		Var_5Static_NonStaticVarMethod.d(); // // Static method z local variable
		
		//NON-static method calling
		Var_5Static_NonStaticVarMethod var5 = new Var_5Static_NonStaticVarMethod();
		System.out.println(var5.a); // non-static variable value a=1 global variable  
		var5.e(); // non-static method e() y=100 local variable 
	}
	
	public static void d() { // Static method
		int z = 200; // local var
		System.out.println(z);
		}
	
	public void e() { // NON-static method     
	int y = 100;  // local var
	System.out.println(y);
	}
}
