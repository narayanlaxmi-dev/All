package day1_pakage;

import java.util.Scanner;
public class example2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner ob = new Scanner(System.in);
		ob.close();
		System.out.println("Enter Two Number to find area of rectangle: ");
		a=ob.nextInt();
		b=ob.nextInt();
		c= a*b;
		System.out.println("The area of rectange is :"+ c);
	}

}
