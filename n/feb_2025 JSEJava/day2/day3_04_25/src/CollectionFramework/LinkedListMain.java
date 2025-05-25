package CollectionFramework;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList data = new LinkedList();
		data.add(1);
		data.add("neyan");
		data.add("LNSHRN");
		data.add(true);
		data.addFirst("first element"); // add element at top
		data.add(3, "mid element");
		data.addLast("last element");

		for (Object obj : data) {
			System.out.println(obj);
		}
	}
}
