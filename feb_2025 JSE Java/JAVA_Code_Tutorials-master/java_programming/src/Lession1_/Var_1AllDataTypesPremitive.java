package Lession1_;

public class Var_1AllDataTypesPremitive {
	
	//NOTE : under class VariableName & under Method VariableName is DIFFERENT------a use 2 time (int a=5)(boolean a=false)
	
	int a = 5; // Class Variable or Global Variable--- it always above method under class
	static int b=6; // note: Static variable always written above method 
		
public static void main(String[] args) {
	int b = 10101;  // int type local variable
	System.out.println(b + " int DataType(dT)"); // 10101
	
	b = 1; // if we have to change Variable Value direct written variableName and vale to put in.
	b = 1001; // value changed
//	b=b; // this minor error  or/ 
	Var_1AllDataTypesPremitive.b = b; // nothing change it's just assign varName---------------------[common error,but correct] 
	System.out.println(b + " same dT modify"); // 1001
	
	
	char c = 'N'; // char type local variable
	System.out.println(c); // N
	
	boolean a = false; // boolean type local variable 
	a= true; 
	System.out.println(a); // true
	System.out.println(9>1);
	System.out.println(9<1); // false because we use conditional statement with println, it's correct
	
	int E = 900;
	int e = 300;
	boolean f = E>e;
	System.out.println(f);
	boolean z =e>E; // It's correct answer is false but return true because we change condition in LINE 20 (a= true;)
	System.out.println(z);
	
	int i = 21;
	float j = i;
	System.out.println(i); // 21
	System.out.println(j); // 21.0
	
	char k = 'a'; // char local var, but char only contain 1 Alphabet in under (' ') 
	System.out.println(k); // a
	
	short l = '1'; // short local var, char also contain 1 char a,1,A under (' ')
	System.out.println(l); // 1
	
	long m = 'n'; // long local var, long also contain 1 long a,1,A under (' ')
	System.out.println(m); // n
	
	String s = "NarayaNa it's me";
	System.out.println(s);
}
}
