package mydemo3;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for two variables");
		if(sc.hasNextInt())
		{
			a=sc.nextInt();
			
		}
		else {
			System.out.println("Enter valid Input");
			return;
		}
		b=sc.nextInt();
		System.out.println("Addition :"+(a+b));

	}

}
