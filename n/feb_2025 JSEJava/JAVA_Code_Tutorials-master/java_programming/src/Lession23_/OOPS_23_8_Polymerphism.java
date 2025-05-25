package Lession23_;

//method OverRiding
public class OOPS_23_8_Polymerphism extends OOPS_23_7_Polymerphism {
	
	public void eat() {
		System.out.println("23_8, you are eating");
	}
	
	public static void main(String[] args) {
		
		// create const for non-static
		OOPS_23_8_Polymerphism ol2 = new OOPS_23_8_Polymerphism();
		ol2.eat(); // o/ p will be child class or present class
		
		OOPS_23_7_Polymerphism ol1 = new OOPS_23_7_Polymerphism();
		ol1.eat(); // print 23_7
	}

}
