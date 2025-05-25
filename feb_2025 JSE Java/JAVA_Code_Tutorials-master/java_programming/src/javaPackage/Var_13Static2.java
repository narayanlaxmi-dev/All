package javaPackage;

public class Var_13Static2 {
	
	int roll; // declare var global
	String name; // declare global var
	String favourite = "Fighting, Driving, Adventure"; // defining global var
	
	public static void main(String[] args) {
		// create object because for global var execute
		Var_13Static2 v14 = new Var_13Static2();
		
		System.out.println(v14.roll); // roll is int dT so by Default value 0
		System.out.println(v14.name); // name is string  dT by default value is NULL
		System.out.println(v14.favourite); //  favorite is defining variableName so print vale O/P
	}

}
