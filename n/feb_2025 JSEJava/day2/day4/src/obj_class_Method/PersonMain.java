package obj_class_Method;

public class PersonMain {

	public static void main(String[] args) {

		Person p = new Person("neyan", "patil", 23);
		Person p1 = new Person("neyan", "patil", 23);
		Person p2 = new Person();
		System.out.println(p.getFirst_name() + p.getLast_name() + p.getAge());
//		System.out.println(p);//pkg.classname @ hexa-decimal code hashcode 
//		---> p person() person super class is obj that why hashcode generated 
		System.out.println(p); // Implicit call
		System.out.println(p.toString()); // Explicit call
		System.out.println(p2);

		System.out.println("------------------- Equals ------------------");
		int myAge = 24;
		int yourAge = 24;
		System.out.println(myAge == yourAge);
		// i have to overridden method equals for work properly
		System.out.println("noth refrence diff : " + p.equals(p1)); // false because both memory is different
		Person p111 = p;
		System.out.println("both refrence same '==': " + (p == p111));
		System.out.println("both refrence same '==': " + (p == p2));
		System.out.println("both value same equals(): " + p.equals(p2));
//		System.out.println(myAge.equals(yourAge));

	}

}
