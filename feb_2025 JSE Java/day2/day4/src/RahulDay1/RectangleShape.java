package RahulDay1;

import java.util.Scanner;

public final class RectangleShape extends Shape { // using final to cant inherit RectangleShape
	private float len, bre;
	Scanner sc = new Scanner(System.in);

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle RULER/Scale>>>>>");
		System.out.println("Enter number length :");
		len = sc.nextFloat();
		System.out.println("Enter number Breath :");
		bre = sc.nextFloat();
	}

	@Override
	public float findArea() {

		return (len * bre);
	}

}
