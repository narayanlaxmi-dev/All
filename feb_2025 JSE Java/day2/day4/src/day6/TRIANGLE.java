package day6;

public class TRIANGLE implements shape {
	private double base, height;

	public void set(double base, double height) {
		this.base = base;
		this.height = height;

	}

	@Override
	public double getArea() { // create method to define interface shapes
		return (0.5 * base * height);
	}

}
