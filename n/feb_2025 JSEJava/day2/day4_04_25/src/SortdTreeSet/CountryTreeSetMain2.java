package SortdTreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class CountryTreeSetMain2 {

	public static void main(String[] args) {

		SortedSet<Country> dataConturies = new TreeSet<Country>(); // class cast excetion
		Country c1 = new Country();
		Country c2 = new Country(03, "Japan", 120000); // i can sorted 6 way 3 element 1 element assending and
														// descending
		Country c3 = new Country(02, "India"
				+ "", 5000000);
		dataConturies.add(c1);
		dataConturies.add(c2);
		dataConturies.add(c3);
		for (Country currentcountry : dataConturies)
			System.out.println(currentcountry);

	}

}
