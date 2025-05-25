package Lession3_;

public class Var_3Array {
	public static void main(String[] args) {
		
		// create an array
		int a[] = { 1, 2, 3, 4, 5, 100}; // int type array local variable
		String b[] ={"Narayan", "Laxmi"}; //if we use char a (' ') && if we use String narayan (" ")
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(a); // unkonwn print because we only use a && not use a[]
		System.out.println(a[0]); // 1
		System.out.println(a[1]); // 2
		System.out.println(a[5]); // 100
		
		// Object is SUPERCLASS so we direct object array created
		Object z[] = { 'a', 1, "narayana", 3>2, 3<2 }; //if we use char a (' ') && if we use String narayan (" ")
		System.out.println(z[0]);
		System.out.println(z[1]);
		System.out.println(z[2]);
		System.out.println(z[3]);
		System.out.println(z[4]);
	}

}
