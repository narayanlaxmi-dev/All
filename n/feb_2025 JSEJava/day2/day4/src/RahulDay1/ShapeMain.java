package RahulDay1;

public class ShapeMain {

	public static void main(String[] args) {
		Shape[] shape = new Shape[2]; // array of shape not an object
		shape[0] = new CircleShape();
		shape[1] = new RectangleShape();

		for (Shape currshape : shape) {
			currshape.draw();
			System.out.println(currshape.findArea());
			currshape.erase();
			System.out.println("-----------");
		}

	}

}
