package CollectionFramework;

import java.util.Stack;
import RandomAcessFile.Book;

public class StackMethodMain {

	public static void main(String[] args) {
		Stack datavalues = new Stack();
		datavalues.add("Welcome to collection framework");
		datavalues.add(new Book("javaBook", 980));
		System.out.println("current size of stack is "+ datavalues.size());
		System.out.println(datavalues);
		
		// push element object in stack
		for(int i=11; i<=15;i++) {
			datavalues.push(i);
		}
		System.out.println("current size of stack is "+ datavalues.size());
		System.out.println("all elements are"+datavalues);
		System.out.println(datavalues.pop());
		System.out.println(datavalues + "size is : "+datavalues.size());
		System.out.println(datavalues.peek());
		System.out.println("11 value present index is : "+datavalues.search(11));
	}
	

}
