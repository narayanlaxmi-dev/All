package Lession22_;


// 2 Single Level Inheritance
public class OOPS22_4_Inheritance extends OOPS22_3_Inheritance  {
	
	public void multiply(int a, int b) {
		z = a * b;
		System.out.println("Multiply is : " + z);
	}
	public void aerow(int a, int b) {
		z = a ^ b;
		
		System.out.println("^ this symbol is : " + z);
	}
	public static void main(String[] args) {
			
		int a =50, b = 100; //defining local variable for operation perform
		// creact Constructor for print
		OOPS22_4_Inheritance inh2 = new OOPS22_4_Inheritance();
		
		inh2.adding(a, b);
		inh2.aerow(22,44); // you can modify variableValue like this
		inh2.divide(a, b);
		inh2.multiply(a, b);
		inh2.modulas(a, b);
		
			
			
	}

}
