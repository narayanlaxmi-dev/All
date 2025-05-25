import java.util.Scanner;


public class squareCube {                             
	
	
	
	
	public static void main(String[] args) {    

		
		// create object 
		int a,b,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number to calculate square and cube :");
		a=obj.nextInt();
		b = a*a;
		c = a*a*a;
		System.out.println("The Square is "+b);
		System.out.println("The Cube is "+c);
	}

}
