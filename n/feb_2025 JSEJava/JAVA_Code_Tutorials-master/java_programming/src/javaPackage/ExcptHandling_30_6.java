package javaPackage;

public class ExcptHandling_30_6 {
	public static void a(int age) {
		
		try {
			if (age <= 18) {
				
				// throw exception
				throw new ArithmeticException("Not Applicable"); 
			
			}else {
				System.out.println("Applicable");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException, ArithmeticException, NullPointerException {
		
		// if you use Thread.sleep(); you you have to add throws
		Thread.sleep(300);
		
		// for static method direct call
		a(15);
		a(19); // this not execute because i condition get wrong, so you have to add if else TRY to CATCH
		a(18); // also got error for if condition true

}
}