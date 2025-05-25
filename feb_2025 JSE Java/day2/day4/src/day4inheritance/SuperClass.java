package day4inheritance;

public class SuperClass {
	void show_info() {
		System.out.println("This is super class Executed....");
	}
}

class SubClass extends SuperClass {

	void show() {
		System.out.println("This is Sub class Executed....");
	}
}