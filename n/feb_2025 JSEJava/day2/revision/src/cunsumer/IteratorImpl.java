package cunsumer;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorImpl {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(90);
		num.add(70);
		num.add(7);
		num.add(8);
		num.add(7);
		num.add(6);
		System.out.println("simple print: " + num);

		Iterator<Integer> iterate = num.iterator();

		int numb = iterate.next();
		System.out.println("next(): " + numb);

		// Iterate through the list and remove element 7
		while (iterate.hasNext()) {
			int current = iterate.next();
			if (current == 7) {
				iterate.remove(); // Remove the element 7
				System.out.println("Removed 7 from the list");
			}
		}

//		iterate.remove();
//		System.out.println("remove(): " + numb);

		while (iterate.hasNext())
			iterate.forEachRemaining((v) -> System.out.println("remaning"+v));

	}

}
