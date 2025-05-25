package RahulDay1;

public abstract class Shape {
	public abstract void draw();

	public abstract float findArea();
	final public void erase() {
		System.out.println("Erasing shape........ concrete methods");
	}
}
