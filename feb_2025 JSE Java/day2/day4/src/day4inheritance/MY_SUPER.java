package day4inheritance;

public class MY_SUPER {
	private int a;
	private int b;
	protected int c;
	public
	void set_data(int a, int b) {
		this.a = a;
		this.b = b;
		c = a + b;

	}

	void get_data() {
		System.out.println("A=" + a + "\tB=" + b + "\tC=" + c);
	}
}
