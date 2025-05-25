package javaPackage;

public class Var_7UnaryOperaters {

	public static void main(String[] args) {
		
		int a = 1 ; // defining local var 
		int b = 10; // def local var 
		
		System.out.println(a + " normal Var_Name");            // 1
		System.out.println(a++ + ++a + a-- + --a);             // 1,2, + 3,3 + 3,2 + 1,1 starting number addition 1+3+3+1= 8 
		System.out.println(a++ + --b);                         // 1,2 + 9,9 so 1+9= 10
		System.out.println();                                  // if you space or blank o/p will be next line
		System.out.println(a++ + ++b);                         // 2,3 + 10,10 = 12
		System.out.println(a++ - ++b);                         // 3,4 - 11,11 = -8
    	System.out.println(a++ * ++b);                         // 4,5 * 12,12 = 48
		System.out.println(a / b);                             // 5 / 12 = 0.416 some thing 
	}
}
