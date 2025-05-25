package javaPackage;

//1Encapsulation
public class OOPS_24_2_Encapsulation extends OOPS_24_1_Encapsulation {
	//final void a() {	// final method cannot overriding
	//}                
	
	public static void main(String[] args) {
		
		//create obj/const for print non-static 
		OOPS_24_2_Encapsulation en1 = new OOPS_24_2_Encapsulation();
		en1.setName("narayan"); // its call setName method and then name() execute getName
		System.out.println(en1.getName());
		
		}
}
// Encapsulation = its object reference is best example like create object and call to print 
// encapsulation = its wrapping/also create obj/const the code in single unit 