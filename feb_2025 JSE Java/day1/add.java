import java.util.Scanner;


public class add {                             
	
	
	
	
	public static void main(String[] args) {    
//		int a=4,b=9,c;
		
		// create object 
		int a,b,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter nubmer for a");
		a=obj.nextInt(); 
		System.out.println("Enter nubmer for b");
		b=obj.nextInt();
		c = a+b;
		System.out.println(a+ "+" +b+ " = "+c);
	}

}
