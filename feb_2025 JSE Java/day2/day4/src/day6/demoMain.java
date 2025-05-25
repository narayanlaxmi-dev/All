package day6;

public class demoMain {

	public static void main(String[] args) {
//		System.out.println("------- A_hybrid inherit ------");
//		D obj=new D();
//		obj.show();
//		obj.myshow();

		/*
		 * create 3 class TRIANGLE CIRCLE and RECTANGLE and interface shape
		 */
		RECTANGLE rect = new RECTANGLE();
		CIRCLE ci = new CIRCLE(5.5);
		TRIANGLE tri = new TRIANGLE();

		rect.set(5.5, 5.6);
		System.out.println("RECTANGLE AREA: " + rect.getArea());

		System.out.println("CIRCLE AREA :" + ci.getArea());
		tri.set(9, 2);
		System.out.println("TRIANGLE AREA :" + tri.getArea());
	}

}
