package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleMain {

	public static void main(String[] args) {
		Set<String> fruit = new HashSet<>(); // compare equals() come in String
		fruit.add("apple");
		fruit.add("Mango");
		fruit.add("watermellon");
		fruit.add("kivi");
		fruit.add("Orange");
		fruit.add("Orange");
		fruit.add("Orange");
		fruit.add("Orange"); // not allowrd removed element
		System.out.println("------ size is "+ fruit.size()+" -----");
		for(String f : fruit){
			System.out.println(f);
		}

	}

}
