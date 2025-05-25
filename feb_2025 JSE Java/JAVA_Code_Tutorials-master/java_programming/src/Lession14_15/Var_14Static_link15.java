package Lession14_15;

public class Var_14Static_link15 {
	
	int roll; // declare var global
	String name; // declare global var
	String favourite = "---Fighting, Driving, Adventure"; // defining global var
	
	//we have to create CONSTRUCTOR it's nothing but className() {}
	Var_14Static_link15(int r, String n) { // i will use 2 parameter(int r, string n) 
		roll = r;
		name = n;	
	}
	
	public void getResult() {
		System.out.println(roll + " " +name +" " + favourite);
	}

}
