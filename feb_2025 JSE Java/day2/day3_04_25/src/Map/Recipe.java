package Map;

import java.util.HashSet;
import java.util.Set;

public class Recipe {
	private String name;
	private int duration;
	private Set<String> ingredients;

	public Recipe() {
		name = "mixture";
		duration = 0;
		ingredients = new HashSet<>();
		ingredients.add("water");
		ingredients.add("honey");
		ingredients.add("chillypaper");
		ingredients.add("cheese");
	}

	public Recipe(String name, int duration, Set<String> ingredients) {
		this.name = name;
		this.duration = duration;
		this.ingredients = ingredients;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setIngredients(Set<String> ingredients) {
		this.ingredients = ingredients;
	}
	// 1 by 1 add in SET
	public void setIngredient(String i) {
		ingredients.add(i);
	}
	public String getName() {
		return name;
	}

	public Set<String> getIngredients() {
		return ingredients;
	}

	public int getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "Recipe [name=" + name + ", duration=" + duration + ", ingredients=" + ingredients + "]";
	}
	
}
