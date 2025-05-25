package day6;

public class A_hybrid {
	void show() {
		System.out.println("1 super super class....");
	}
}

class B extends A_hybrid {
	void show() {
		super.show();
		System.out.println("2 Sub/base of A  class....");
	}
}

interface C {
	public void myshow();
}

class D extends B implements C {
	void show() {
		super.show(); // B class call here
		myshow(); // call here
		System.out.println("3 base of B and interface of C class....");
	}

	@Override
	public void myshow() {

		System.out.println("4 Interface class....");
	}

}
