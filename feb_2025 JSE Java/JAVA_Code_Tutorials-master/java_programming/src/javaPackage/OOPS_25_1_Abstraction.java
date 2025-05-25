package javaPackage;

//1abstract  ,  means hide the implementation show functionality 
public abstract class OOPS_25_1_Abstraction { // abstract class select by creating class
	
	static int a =5;
	int b = 1;
	final int c = 10;
	
	//1 abstract method using abstract keyword
	abstract void eat(); // in abstraction method does not contain body for hiding implementation code
	
	abstract void fight();// another abstract method 
	
	//2 non- abstract method 
	public void a() {
		System.out.println("non-abstract method");
	}

}
