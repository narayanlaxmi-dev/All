package javaPackage;

//constructor 1
public class Constructor_27_2 {
	
	int id;
	String name;
	String types;
	
	// by Default const 
	Constructor_27_2() { // by DEFAULT non- parameter constructor method
		System.out.println("hello i am default constructor in 27_2");
	}
	
	// Parameterized constructor
	Constructor_27_2(int a, String b, String c){
		this.id = a;
		b = name;
		c = types;
	}
	
	// non static method print
	public void displayInfo() {
		
		System.out.println(id +" "+ name +" "+ types);
	}
	
	public static void main(String[] args) {
		Constructor_27_2 co2 = new Constructor_27_2();	
		co2.displayInfo();
		//System.out.println(co2.displayInfo(1, "john","hello"));// this not work  so insted create new const
		
		
		
		// i provide parameterized then why it not showing in o/p
		Constructor_27_2 co3 = new Constructor_27_2(1, "nara", "yana");
		co3.displayInfo();
		Constructor_27_2 co4 = new Constructor_27_2(2, "narayana","FIHD");
		co4.displayInfo();

	}
	
}
