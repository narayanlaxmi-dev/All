package day4inheritance;

public class FY {
	private int roll_no, sub1, sub2, sub3;
	protected int total;
	private String name;

	public void set(int roll_no, String name, int sub1, int sub2, int sub3) {
		this.name = name;
		this.roll_no = roll_no;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		total = sub1 + sub2 + sub3;
	}

	void show() {
		System.out.println("ROLLNO " + roll_no + "\tName " + name + "\tSUB1 =" + sub1 + "\tSUB2 =" + sub2 + "\tSUB3 ="
				+ sub3 + "\ttotal =" + total);
	}

}

class SY extends FY {
	private int sub4, sub5, sub6;
	private int total2;
	private float percentage;

	public void set(int sub4, int sub5, int sub6) {

		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
		total2 = sub4 + sub5 + sub6;
		percentage = (float) (total + total2) / 6;
	}

	void show() {
		super.show();
		System.out.println("\t\tSUB4 =" + sub4 + "\tSUB5 =" + sub5 + "\tSUB6 =" + sub6 + "\ttotal =" + total2
				+ "\tPERCENTAGE " + percentage);
	}
}
