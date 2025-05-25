package day4inheritance;

public class MY_SUB extends MY_SUPER {
	private int p;
	private int q;
	private int ans;

	public void set_data(int p, int q) {
		super.set_data(5, 5);
		this.p = p;
		this.q = q;
		ans = (p * q) + c;
	}

	void get_data() {
		super.get_data();
		System.out.println("P=" + p + "\tQ=" + q + "\tAns=" + ans);
	}

}
