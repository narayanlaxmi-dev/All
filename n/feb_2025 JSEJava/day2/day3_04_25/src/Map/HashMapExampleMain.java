package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExampleMain {
	public static void main(String[] args) {
		Map<String, Integer> phonebook = new HashMap<>();
		phonebook.put("narayan", 908867454);
		phonebook.put("Shiva", 986745456);
		phonebook.put("neyan", 978674564);
//		phonebook.put("neyan", 978674543); // override old one 0

		System.out.println("-------------- key fetch so o/p key-value -----------------");
		Set<String> name = phonebook.keySet(); // fetch keys

		for (String n : name) {
//			System.out.println(n);
			Integer mobileno = phonebook.get(n);
			System.out.println("Name : " + n + "\t mobile number : " + mobileno);

		}
		System.out.println("\n---------- value fetch -----------");
		Collection<Integer> allmobileno = phonebook.values();
		for (Integer mo : allmobileno) {
			System.out.println("only value pairs :" + mo);
		}
	}
}
