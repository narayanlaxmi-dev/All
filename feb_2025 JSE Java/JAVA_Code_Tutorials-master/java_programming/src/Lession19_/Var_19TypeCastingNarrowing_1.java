package Lession19_;

public class Var_19TypeCastingNarrowing_1 {

	public static void main(String[] args) {
		
		double a = 5.9;
		int b = (int) a; // manual casting define new var and which dT you get and varName
		
		System.out.println(b); // 5.9 into 5
		System.out.println(a); // 5.9 at it is.
		
		// String into integer
		String s = "11";
		int i = Integer.parseInt(s); // method integer conversion so Integer.parseInt(s); varName s vale convert
		System.out.println(s + " = String Vaslue");
		System.out.println(i+ " = Int value");
		
		// integer to string
		int x = 0101; // if you add 0 in starting it convert binary or SOMETHING CHECK---??? 
		String y = String.valueOf(x);
		String z = String.valueOf(true);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
