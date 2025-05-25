package javaPackage;

//single dimension array
public class Array_21_3UserdefMethod {
	 static int a[] = {3,2,3,4,5,1};   // if you run line 24 you have to comment this line 4)
	
	//user define method passingArrayintomethod
	public static void passingArrayToMethod(int a[]) {  // we have to create parameter
		
		int b = a[0]; // index 0 and varNamw a
		
		// for loop 
		for(int i=0; i<a.length; i++) {
			
			//if else statement
			if (b >= a[i]) { // this mean  b=3 index of a is 0 and check a[i] i=index of a 1,2,3 at time 3 
				System.out.println(b);
					
			}else {
				System.out.println("Else Part Run");
			}
		}  
	}
	public static void main(String[] args) {
		//int a[] = {3,2,3,4,5,1}; // NOTE: You can also add this in class static int a[] = {3,2,3,4,5,1};   
		passingArrayToMethod(a);
	}

}