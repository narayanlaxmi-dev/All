package javaPackage;

// MULTIPLE dimension Inheritance
public class OOPS22_7_Inheritance extends OOPS22_6_Inheritance {
	
	public void driving() {
		System.out.println(" 22_7, i love to driving");
	}
	public static void main(String[] args) {
		
		// create constructor for print
		OOPS22_7_Inheritance inh3 = new OOPS22_7_Inheritance();
		
		inh3.write(); // child class run because i reassign the write()5 into write()6 
		inh3.fighting();
		inh3.driving();
		
		
		// OOPS22_5_Inheritance inh2 = new OOPS22_6_Inheritance(); // if i create parent class obj = new child class
		// so you only run class 22_5 not run class 22_6 , 222_6 in same method as class 22_5 so it run
		
	}

}
