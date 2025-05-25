package Lession21_;

//single dimension array
public class Array_21_2ObjectArr {

	public static void main(String[] args) {
		
		//we can write an array in below fashion 
		int b[] = {1, 2, 3, 4, 5}; // defining int aArray
		String s[] = {"hi","hello"}; // defining str array
		
		Object o[] = {"Selenium", 1 ,3>2, 4, "narayana ", 3, 4.9 }; // defining OBJECT array
		System.out.println(o.length); // index length 7
		System.out.println(b.length); // index length 5
		System.out.println(s.length); // index length 2
		
		System.out.println(o[0]);
		System.out.println(o[2]);
		System.out.println(o[5]);
		System.out.println(o[4]);
		
		//reassign value
		o[2] = false;
		System.out.println(o[2]);

	}

}
