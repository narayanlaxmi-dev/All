package SortdTreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {

		// to perform sorting elemetn must similar data type
		SortedSet<String> dataConturies = new TreeSet<>();
		dataConturies.add("India");
		dataConturies.add("Japan");
		dataConturies.add("london"); // if word is not upper in first character A-Z then a-z
		dataConturies.add("Germany");
		dataConturies.add("USA");
		
		for (String o : dataConturies)
			System.out.print(o + ", ");

		System.out.println("------------- Integer sorting -------------");
		SortedSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(26451);
		numbers.add(621);
		numbers.add(521);
		numbers.add(821);
		numbers.add(21);
		numbers.add(1);
		numbers.add(1); // duplicated privent not runnig
		numbers.add(1);
		for (int o : numbers)
			System.out.println(o);
	}

}
