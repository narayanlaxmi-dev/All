package javaPackage;

public class Var_9LogicalOp {

	public static void main(String[] args) {
		
		int a = 10;   // def local var 
		int b = 5;    // defining local var
		int c = 20;   // def local var
		
		// logical operator only check 1 condition if its true then check else otherwise false 
		System.out.println(a < b && a < c);
		
		// Bitwise operator always check both condition
		System.out.println(a < b & a < c); // first condition false else true but answer false, bec false+true=false 
		System.out.println(a > b & a < c); // both condition true 
		
		// Unary operator adding 
		System.out.println(a < b && a++ < c); // 10<5 && 10,11 < 20
		System.out.println(a); // 10
		System.out.println(a < b & a++ < c);
		System.out.println(a); // 11
	}
}
