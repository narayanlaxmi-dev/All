package prachi;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		if(sc.hasNextInt())
		{
			a=sc.nextInt();
			b=sc.nextInt();
		}
		else 
		{
			
		System.out.println("Enter valid Input");
		return;
		}
		
		System.out.println("Addition :"+(a+b));
		
		

	}

}
