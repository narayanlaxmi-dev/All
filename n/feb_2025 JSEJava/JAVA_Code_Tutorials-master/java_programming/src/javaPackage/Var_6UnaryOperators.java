package javaPackage;

public class Var_6UnaryOperators {

	public static void main(String[] args) {
		
		int a = 10 ; // defining local var 
		
		System.out.println(a + " normal Var_Name");   // 10
		System.out.println(a++); // 10, 11, print always FIRST value and last value is CURRENT value
		System.out.println(a);   // 11
		System.out.println(a--); // 11, 10 
		System.out.println(--a); // 9, 9 
		System.out.println(++a); // 10, 10 

	}

}
