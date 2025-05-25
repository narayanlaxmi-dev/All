package Lession22_;

//3 Hierarchical Inheritance
public class OOPS22_10_Inheritance extends OOPS22_8_Inheritance {
	
	public void advanture() {
		System.out.println(" 22_10, i love to go advanture");
	}
	public static void main(String[] args) {
		
		// to print we create constructor
		OOPS22_10_Inheritance inh4 = new OOPS22_10_Inheritance();
		
		inh4.driving();
		//inh4.eat(); you have to create const in 22_9 to execute this line
		inh4.advanture();
		inh4.fighting();
		inh4.hacking();
		
	}

}
