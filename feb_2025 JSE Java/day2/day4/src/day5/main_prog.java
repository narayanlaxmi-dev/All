package day5;

public class main_prog {

	public static void main(String[] args) {
		System.out.println("---------- Default Constructor -------------\n");
		point_sub ps = new point_sub();
		ps.show();
		System.out.println("---------- Paramaterized -------------\n");
		point_sub parameter = new point_sub(1, 2, 3, 4);
		parameter.show();

		System.out.println("\n----- MULTILEVEL INHERITANCE ----");
		sub2 s = new sub2();
//		s.show1();
//		s.show2();
//		s.show3();
		s.show();

		System.out.println("\n----- MULTIPLE INHERITANCE ----");
		C obj = new C();
		obj.myset(); // interface method call
//		 obj.set(5, 5); // super class value
		obj.set(4, 4, 4, 4);
		obj.show();
	}

}
