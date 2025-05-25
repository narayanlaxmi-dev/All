package RahulDay1;

import java.util.Scanner;

public final class CircleShape extends Shape { // using final to cant inherit CircleShape

	private float radius;
	Scanner sc = new Scanner(System.in);

	@Override
	public void draw() {
		System.out.println("Drawing Circle COMPAS>>>>>");
		System.out.println("Enter number radius :");
		radius = sc.nextFloat();

	}

	@Override
	public float findArea() {

		return (float) Math.PI * radius * radius;
	}

}
