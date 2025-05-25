package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TypeSafeCollectionMain {

	public static void main(String[] args) {
		List<String> city = new ArrayList<>();// holds only string // Type_Safe collection
		city.add("LNSHN");
		city.add("nashik");
		city.add("mumbai");
		city.add("pune");
		city.add("Nandurbar");
//		city.add(80); // if i uncomment gives us error  

		for (String c : city) { // object only hold string so no need to type casting
			System.out.println(c.toUpperCase());
		}

	}

}
