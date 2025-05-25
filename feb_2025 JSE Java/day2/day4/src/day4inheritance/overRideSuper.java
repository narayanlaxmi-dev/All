package day4inheritance;

public class overRideSuper {
	void show() {
		System.out.println("this is Super class");
	}
}

class overRideSub extends overRideSuper {
	void show() {
		super.show();// OVERRIDE fun / method
		System.out.println("this is sub class");
	}
}