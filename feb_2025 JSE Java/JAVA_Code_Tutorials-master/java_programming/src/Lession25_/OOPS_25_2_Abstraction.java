package Lession25_;

//1abstract  
public class OOPS_25_2_Abstraction extends OOPS_25_1_Abstraction { // abstract class select by creating class

	// @Override means this simple class NOT abstract class so create abstract method present in abstract class
	void eat() { 
		System.out.println("Abstract method, i love eating");
	}
	@Override
	void fight() {
		
		System.out.println("Abstract method, I am a warrior");
	}
	
	public static void main(String[] args) {
		// create obj/const to print
		OOPS_25_2_Abstraction ab1 = new OOPS_25_2_Abstraction();
		ab1.a();
		ab1.fight();
		ab1.eat();
		
		}

	
	
	
}
