package assignments_java3;

public class WrapperClass {

	public static void main(String[] args) {
		Integer a = new Integer(15);
		Integer b = new Integer("15");
		int c = a;
		System.out.println("Integer assign int " + c);
		System.out.println("print Integer 15 : " + a);
		System.out.println("print Integer \"15\" : " + b);
		System.out.println("----------  with == operator  ----------");
		if (a == b)
			System.out.println("the result is TRUE by using '=='");
		else
			System.out.println("the result is FALSE by using '=='");

		System.out.println("---------- with equals() ----------");
		if (a.equals(b))
			System.out.println("the result is TRUE by using obj.equals(b)");
		else
			System.out.println("the result is FALSE by using equals()");

	}

}
