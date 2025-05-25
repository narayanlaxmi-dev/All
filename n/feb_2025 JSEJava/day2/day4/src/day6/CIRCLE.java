package day6;

public class CIRCLE implements shape {
	private static float pi = 3.14f;
	private double radius;

	 CIRCLE(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {// create method to define interface shape

		return (pi * radius * radius);
		// return (Math.PI * radius * radius); // function
	}

}
