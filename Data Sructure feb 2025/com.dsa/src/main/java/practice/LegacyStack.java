package practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LegacyStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println("pop element " +stack.pop());
		stack.push("D");
		stack.push("E");
		System.out.println(stack.toString());
		System.out.println("pop element " + stack.pop()); // pop element
		
		System.out.println("\n\n--- DEQUEUE ---");
		 Deque<String> s = new ArrayDeque<>();

	        s.push("First");
	        s.push("Second");
	        s.push("Third");

	        System.out.println(s.pop()); // Third
	        System.out.println(s.pop()); // Second
	}
}
