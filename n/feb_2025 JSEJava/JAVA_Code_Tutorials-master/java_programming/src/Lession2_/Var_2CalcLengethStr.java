package Lession2_;

public class Var_2CalcLengethStr {

	public static void main(String[] args) {
		//String= name && s =v nickname
		String s = "NarayaNa it's me"; //str dataType localVariable
		
		//calc the length of string 
		int lengthOfString = s.length();
		System.out.println(lengthOfString);
		a();
 	}
	static int i = 1; // its OKAY to static because method close upper } mark so, it's present class
	
	//user=define method
	public static void a() {
		
		String s = "User-define method";
		System.out.println(s);
		}
}
