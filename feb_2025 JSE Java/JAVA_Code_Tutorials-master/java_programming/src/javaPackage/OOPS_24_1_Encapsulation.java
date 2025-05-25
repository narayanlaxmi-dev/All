package javaPackage;

//1Encapulation
public class OOPS_24_1_Encapsulation {
	
	static int c; // declaring static var int dT
	String name; // declare global var str dT
	int a; // declare global var int dT
	final int b = 2; // you cannot change/reassign final variable,class,method
	//b=4; // cannot modify var
	
	// final method
	final void a() {
		System.out.println("final method");
	}
	
	public void setName(String s) { // pass String s parameter
		// s = name; it is direct assign  // link variableName
		
		//this keyword refer to instance/global var of current class
		this.name = s; // assign using this keyword
		c = 5; // if static method used NO NEED to use this keyword
		this.a = 10;
		System.out.println(c); // 
		System.out.println(a); // 
		System.out.println(b); // final variable print 2
		}
		
		// create object and return name, so indirectly call setName method by help of (string s) parameter
		public Object getName() {
			return name; 
		}
	}
	


