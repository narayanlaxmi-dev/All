package javaPackage;


// 1 Single Level Inheritance
public class OOPS22_2_Inheritance extends OOPS22_1_Inheritance{ // if we extends so we will be code optimization
	
	String name="Selenium";// global variable
	
	public static void main(String[] args) {
		
		//you have to create Constructor for non-static value call
		OOPS22_2_Inheritance inh = new OOPS22_2_Inheritance();
		
		System.out.println(inh.roll); // we use inh again and again so its REAUSIBILITY the code
		System.out.println(inh.name);

	}

}

/* package javaPackage;

public class OOPS22_2_Inheritance {
	
	String name="Selenium";// global variable
	
	public static void main(String[] args) {
		
		//you have to create Constructor for non-static value call
		OOPS22_2_Inheritance inh = new OOPS22_2_Inheritance();
		OOPS22_1_Inheritance a = new OOPS22_1_Inheritance();       this is create new constructor  and use OOPS_1_inh we can directly extends
		
		System.out.println(a.roll);
		System.out.println(inh.name);

	}

} */
