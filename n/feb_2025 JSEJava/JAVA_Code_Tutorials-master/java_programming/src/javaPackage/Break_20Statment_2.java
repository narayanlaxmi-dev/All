package javaPackage;

public class Break_20Statment_2 {

	public static void main(String[] args) {
		
		// outer loop
		for (int i=1; i<3; i++) { // at first i=1, i=2
			
			
			
			// inner loop
			for (int j=1; j<3; j++) { // j=1. 2 time Start this point i=1 & j=2. 3 time j=3 condition false, go outer loop i=2
				
				
				
				//if else Stat
				if (i == 2 && j == 2) { //i,j=1  i=1,j=2   i=2,j=1 condition match but j=1 false   
					break;
				}
				
				System.out.println(i +" "+ j); //this print 1 1 , 1 2,  2 1
			}
			System.out.println("Came out inner loop");
		}
		System.out.println("Came Out Outer Loop");

	}

}
