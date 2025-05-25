package javaPackage;

//constructor 1
public class Constructor_27_3 {
	
	// Constructor OverLoading
	Constructor_27_3(){ // non parameterized
		System.out.println("Defalut Const");
	}
	
	Constructor_27_3(int a){// 1 parameter
		System.out.println(a+" ");
	}
	
	Constructor_27_3(int a, String b){ // 2 parameter
		System.out.println(a +" "+ b);
	}
	
	Constructor_27_3(String c){
		System.out.println("string argument const");
	}
	
	public static void main(String[] args) {
		
		Constructor_27_3 co4 = new Constructor_27_3();
		Constructor_27_3 co5 = new Constructor_27_3(1);
		Constructor_27_3 co6 = new Constructor_27_3(1, "nara-yana");
		Constructor_27_3 co7 = new Constructor_27_3("string");
		
		co4.equals(co7);
		co5.equals(co6);
	}
}
