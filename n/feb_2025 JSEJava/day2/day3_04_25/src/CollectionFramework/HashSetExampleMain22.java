package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleMain22 {

	public static void main(String[] args) {
		Set<Fruit> fruit = new HashSet<>(); // fruit object equals() check buti dont overridden duplicated added
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit("apple", "red");
		Fruit f3 = new Fruit("Mango", "yellow");
		Fruit f4 = new Fruit("apple", "red");// duplicated
		Fruit f5 = new Fruit("Mango", "yellow");// duplicated
		Fruit f6 = new Fruit("apple", "rAd");
		fruit.add(f1); // when i add hashcode memory allocated
		fruit.add(f2);
		fruit.add(f3);
		fruit.add(f4);
		fruit.add(f5);
		fruit.add(f6);
		System.out.println("--------- hashCode ------------");
		System.out.println(" hashcode f2 :-" + f2.hashCode());
		System.out.println(" hashcode f4 :-" + f4.hashCode());
		System.out.println(
				" hashcode f6 length same so hashcode sa" + "me but name different so equals flase:-" + f6.hashCode());
		System.out.println("f1 and f4 object equals() :-" + f2.equals(f4));
//		System.out.println(f2.hashCode());
//		System.out.println(f3.hashCode());
		System.out.println("------ size is " + fruit.size() + " -----");
		for (Fruit f : fruit) {
			System.out.println(f); // order may same may not be same in output
		}

	}

}
