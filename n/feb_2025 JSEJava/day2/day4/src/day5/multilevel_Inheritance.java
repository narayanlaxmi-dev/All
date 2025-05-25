package day5;

public class multilevel_Inheritance {
	void show() {
		System.out.println("GrandFather super super class");
	}
}

class sub1 extends multilevel_Inheritance {
	void show() {
		super.show();
		System.out.println("Father sub class of grandfather and super class son");
	}
}

class sub2 extends sub1 {
	void show() {
		super.show();
		System.out.println("Son sub class of father");
	}
}