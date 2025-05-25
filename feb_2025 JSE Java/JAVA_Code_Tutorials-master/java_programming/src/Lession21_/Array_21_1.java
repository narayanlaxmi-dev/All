package Lession21_;

//single dimension array
public class Array_21_1 {

	public static void main(String[] args) {
		
		//defining array
		int a[] = new int [5]; // defining size/index 0-4 value stored 1-5
		
		//printing the length of an array
		System.out.println(a.length);// index length print 5  
		
		// print default value of int array
		for ( int i =0; i<a.length; i++) { //i<a.length i=0 and a length is 1-5 that means i= 0-4 index totally 0+1+2+3+4 = 5
			
			//System.out.println(i);  // it print indexing/storage value 0 to 4 
			System.out.println(a[i]); // it print value by default
			
		}
		// Assigning value in array by help of index
		a[0] = 32;
		a[1] = 43;
		a[2] = 54; // 54
		a[3] = 65;
		a[4] = 76;
		//a[5] = 87; this got error
		
		System.out.println(a[2]); // 54
		
		//print all array use loop
		for ( int i =0; i<a.length; i++) {
			System.out.println(a[i]); // 32,43,54,65,76
		}
	}

}
