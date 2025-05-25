package javaPackage;

public class ExcptHandling_30_3 {
	
	public static void main(String[] args) {
		
		int a[] = new int[5]; 

		try {
			a[6]= 50;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Array, EXCEPTION HANDLING, ArrayIndexOutOfBoundsException");
	}
	

}
