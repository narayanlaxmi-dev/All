package javaPackage;

public class FirstVariable_CallMethod {
	
	// this int a=5; is stored data temperary in memory RAM, after execution done then data deleted in the RAM 
	// inside the RAM a variable is stored memory allocated like 4 byte store data and a name value hold 5
	int a = 5; // Class Variable or Global Variable--- it always above method under class 
	
	static int b=6; // note: Static variable always written above method 
	
	public static void main(String[] args) {
    System.out.println("Variables");
    
     int e= 5; // static is NOT APPLIED under method. You got error,so i removed (Static)
     System.out.println(e); // 5
    amethod();
    bmethod();
	}

	
	
/* NOW let see calling Functions, first we create USER_DEFINE METHOD()*/ 
    public static void amethod() {
	System.out.println("Calling USER_DEFINE method name: amethod()");
    //then you have to call with main method  JVM machine run starting main method {} other method not run you have to call add method name amethod();
}
    
    
      
// now let see print vs print+ln(line next)
    public static void bmethod() {
    	System.out.println("Calling USER_DEFINE method name: bmethod()");
    	System.out.print("LINE 1, This is print method used direct line. ");
    	System.out.println("LINE 2, This is println statement continue with upper line(LINE 1)");
}
}