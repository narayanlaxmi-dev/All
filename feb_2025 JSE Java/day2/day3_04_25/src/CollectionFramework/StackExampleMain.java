package CollectionFramework;

import java.util.Stack;
import RandomAcessFile.Book;

public class StackExampleMain {

	public static void main(String[] args) {
		Stack datavalues = new Stack();
		datavalues.add("Welcome to collection framework");
		datavalues.add(100);// wrapper class autoconverted adatavalues.add(new Integer(100));
		datavalues.add(new Book("javaBook", 980));
		int stackSize = datavalues.size();
		System.out.println("the size of datavalue stack :" + stackSize);
		System.out.println(datavalues);

		System.out.println("\nAll " + stackSize + " elements are displayed");
		/*
		 * for (int i = 0; i < stackSize; i++) { Object obj = datavalues.get(i);
		 * System.out.println(obj); }
		 */
		for (Object o : datavalues) {
			System.out.println(o);
		}

		System.out.println("-------------- Stack Operation operation perform -------------");
		System.out.println("pop() item is :- " + datavalues.pop()); // pop last element
		System.out.println(datavalues);
		System.out.println("\npush() item is :- "+datavalues.push("hello"));
		System.out.println(datavalues);
		System.out.println("\nPeek() / see how is top item is :- "+datavalues.peek());
		System.out.println(datavalues);
	}

}
