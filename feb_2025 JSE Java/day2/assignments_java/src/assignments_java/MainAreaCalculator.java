package assignments_java;

public class MainAreaCalculator {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println("area rectangle " + r.calculateArea(2, 2));
		System.out.println("perimeter rectangle " + r.calculatePerimeter(2, 2));

		Square s = new Square();
		System.out.println("area Square " + s.calculateArea(2));
		System.out.println("perimeter Square " + s.calculatePerimeter(2));
	}

}
