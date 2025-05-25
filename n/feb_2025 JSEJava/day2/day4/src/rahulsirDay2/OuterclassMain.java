package rahulsirDay2;

public class OuterclassMain {

	public static void main(String[] args) {
		System.out.println("\n\n---------- static class ---------------");
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		si.print();
		OuterClass.StaticInner.printstat(); // static method call one disadv non stat var not called

		System.out.println("\n\n---------- Nested  class ---------------");
//		OuterClass.Nested onn = new OuterClass().new Nested();
//or 				
		OuterClass out = new OuterClass();
		OuterClass.Nested o = out.new Nested();

		o.print();
		OuterClass.Nested.printstat();
		
		System.out.println("\n\n---------- local class inside method ---------------");
		out.print();
	}

}
