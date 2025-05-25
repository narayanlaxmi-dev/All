package day5;

public class point_super {
	private int a, b;

	// super default const
	point_super() {
		a = 500;
		b = 600;
	}

	point_super(int a, int b) { // this call sub parameterized constructor
		this.a = a;
		this.b = b;

	}

	void set(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void show() {
		System.out.println("A= " + a + "\tB= " + b);
	}
}

class point_sub extends point_super {
	private int q, p;

	// sub default const
	point_sub() {
		super(); // execute super class constructor fix first position in constructor
		q = 1500;
		p = 1600;

	}

	point_sub(int a, int b, int q, int p) {
		super(a, b);
		this.p = p;
		this.q = q;

	}

	void show() {
		super.show();
		super.set(111, 222);

		super.show(); // i can define any where in function
		System.out.println("Q= " + q + "\tP= " + p);
	}
}
