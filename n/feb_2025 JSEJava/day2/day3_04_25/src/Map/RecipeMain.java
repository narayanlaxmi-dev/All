package Map;

import java.util.HashSet;
import java.util.Set;

public class RecipeMain {

	public static void main(String[] args) {
		Recipe r1 = new Recipe();
		System.out.println(r1.toString());
//		Set<String> r2ing = Set.of("milk", "Suger", "tea", "water"); // unmodifable set no modified added 
		Set<String> r2ing = new HashSet<String>();
		r2ing.add("milk");
		r2ing.add("tea");
		r2ing.add("water");
		Recipe r2 = new Recipe("tea", 5, r2ing);
		Set<String> r2i = r2.getIngredients();
		System.out.println("making : " + r2.getName());
		for (String rr : r2i)
			System.out.println(rr);

		r2.setIngredient("ilichi");
		// print
		System.out.println(" added manually name of recipe is: " + r2.getName());
		for (String rr : r2i)
			System.out.println(rr);
	
	}

}
