package day5;

public class multiple_inheritance {
	private int a, b;
	protected int c;

	public void set(int a, int b) {
		this.a = a;
		this.b = b;
		c = a + b;
	}

	public void show() {
		System.out.println("A= " + a + "\tB= " + b + "\tC= " + c);
	}
}

interface b_inter {
	final static int a = 20;
	final static int b = 20;

	public void myset();
}

class C extends multiple_inheritance implements b_inter {
	private int p, q;
	private int ans;
	private int myans = 0;

	public void set(int a, int b, int p, int q) {
		super.set(a, b);
		this.p = p;
		this.q = q;
		ans = (p * q) + c;
	}

	public void show() {
		super.show();
		System.out.println("P= " + p + "\tQ= " + q + "\tANS= " + ans);
	}

	public void myset() {
		myans = a + b;
		System.out.println("my ans interface value " + myans);
	}
}
