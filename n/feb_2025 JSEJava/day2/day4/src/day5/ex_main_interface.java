package day5;

public class ex_main_interface {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.show();
		t.myshow(); // interface method

		my_interface myobj = new Test1();
		// cant access class method only interface declaring method access
		myobj.myshow(); // create interface object
		System.out.println("sum pi and 2 = " + myobj.method1());
		
	}

}
