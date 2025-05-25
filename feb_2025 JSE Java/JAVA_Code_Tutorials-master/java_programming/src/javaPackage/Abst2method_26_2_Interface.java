package javaPackage;

//Interface1
public class Abst2method_26_2_Interface implements Abst2method_26_1_Interface {// interface & class implements, if same class then extends

	//@Override
	public void fight() {
		System.out.println(" I love to fight with using Katana...");
		
	}

	//@Override
	public void drive() {
		System.out.println(" I love to Drive for Incenly Drifting...");
		
	}
	
	public static void main(String[] args) {
		
		// create obj for print
		Abst2method_26_2_Interface in1 = new Abst2method_26_2_Interface();
		in1.drive();
		in1.fight();
	}

}
