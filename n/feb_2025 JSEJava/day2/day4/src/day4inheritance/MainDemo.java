package day4inheritance;

public class MainDemo {

	public static void main(String[] args) {
		System.out.println("--- Super class ---");
		SuperClass sp = new SuperClass();
		sp.show_info();
		System.out.println("--- sub class ---");
		SubClass sb = new SubClass();
		sb.show_info();
		sb.show();

		System.out.println("\n---- OVER RIDING  Method ----");
		overRideSub os = new overRideSub();
		os.show();

		System.out.println("\nMYSUPER MUSUB ---> SINGLE inheritance");
		MY_SUB a = new MY_SUB();
		a.set_data(2, 3);
		a.get_data();

		System.out.println("\n--- EMPLOYEE ---  ");
		BONUS bo = new BONUS();
		bo.set_data(02, "neyan", 20000);

		bo.get_data();
		bo.set_data();
		bo.get_data();

		System.out.println("\n--- COLLAGE ---  ");
		SY se = new SY();
		se.set(01, "neya", 90, 90, 90);
		se.set(50, 50, 50);
		se.show();
	}

}
