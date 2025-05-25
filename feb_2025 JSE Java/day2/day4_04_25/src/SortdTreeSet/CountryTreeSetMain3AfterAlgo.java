package SortdTreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CountryTreeSetMain3AfterAlgo {

	public static void main(String[] args) {
		
		Comparator<Country> desccodeComp = new CountryCodeDescComparator(); 
		Comparator<Country> descpopComp= new CountryPopulationDescComparator();
//			SortedSet<Country> dataConturies = new TreeSet<Country>(); // comparable algo come default algo if(treset obj in default const) 
//		SortedSet<Country> dataConturies = new TreeSet<Country>(desccodeComp); // code descending
		SortedSet<Country> dataConturies = new TreeSet<Country>(descpopComp);
		Country c1 = new Country();
		Country c2 = new Country(03, "Japan", 120000); // i can sorted 6 way 3 element 1 element assending and
														// descending
		Country c3 = new Country(02, "India"
				+ "", 500000000);
		dataConturies.add(c1);
		dataConturies.add(c2);
		dataConturies.add(c3);
		for (Country currentcountry : dataConturies)
			System.out.println(currentcountry);

	}

}
