package day6;

public class RECTANGLE implements shape {
	private double length, width;

	public void set(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {// create method to define interface shape

		return (length * width);
	}

}
