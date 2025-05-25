package Lession12_;

public class Var_12NonStaticCall {
	int a = 1;
	static int b = 2;
	
	// Non-static method 
	public void a() {
		String a = "nara";
		System.out.println(a);
	}
	
	static int c = 3;              // call using 3 different ways
	
	//static method
	public static void b() {
		int a = 11;
		System.out.println(a);
	}
	
	//main method to call ma ctrl+space
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//static User-define method call
		b();
		
		//create object from non-static user-define method
		Var_12NonStaticCall v12 = new Var_12NonStaticCall();
		System.out.println(v12.c); // Not appropriate way-------------[common error,but correct]
		System.out.println(Var_12NonStaticCall.c); // appropriate way
		System.out.println(c); // simply call, because it's static variable correct way
		System.out.println(v12.a);
		v12.a(); // call non static method
		
	}

}
