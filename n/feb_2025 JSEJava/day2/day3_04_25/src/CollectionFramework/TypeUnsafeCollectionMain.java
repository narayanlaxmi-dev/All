package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TypeUnsafeCollectionMain {

	public static void main(String[] args) {
		List city = new ArrayList();
		city.add("LNSHN");
		city.add("nashik");
		city.add("mumbai");
		city.add("pune");
		city.add("Nandurbar");
//		city.add(80); // ClassCastException:

		for (Object obj : city) {
			String c = (String) obj;// typecasting to convert string
			System.out.println(c.toUpperCase());
		}

	}

}
