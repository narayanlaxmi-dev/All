package ass2;

class BOX {
	private double width, height, depth; // INSTANCE VARIABLE

	public BOX(double d, double e, double f) {
		this.depth = f;
		this.height = e;
		this.width = d;
	}

	public String getBoxDetails() {
		return "[Width: " + width + ", Height: " + height + ", Depth: " + depth + "]";
	}

	public double computedVolume() {
		return depth * height * width;
	}
}

public class arr1Box {

	public static void main(String[] args) {
		BOX b = new BOX(5.2, 5.2, 5.2);
		System.out.println();
		System.out.println("concinated value :-\n" + b.getBoxDetails());
		double volume = b.computedVolume();
		System.out.println("Computed Volume of Box: " + String.format("%.3f", volume));
	}

}

/*
 * concinated value :- [Width: 5.2, Height: 5.2, Depth: 5.2] Computed Volume of
 * Box: 140.608
 */
