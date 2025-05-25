package day5;

interface my_interface {
	final static public float pi = 3.14f;// public float pi = 3.14f;

	public void myshow();

	public float method1();

}

public class Test1 implements my_interface {
	private int a = 2;

	void show() {
		System.out.println("class method working...");
		System.out.println("A = " + a);
		System.out.println("permission to access interfavce var :- pi = " + pi);
	}

	// interface method
	public void myshow() {
		System.out.println("interface working ");
	}

//	interface method
	public float method1() {
		float sum = pi * a;// permission to access class variable

		return sum;

	}
}
