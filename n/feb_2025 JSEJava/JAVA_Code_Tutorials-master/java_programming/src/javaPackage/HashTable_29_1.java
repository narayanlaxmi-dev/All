package javaPackage;

import java.util.Hashtable;

public class HashTable_29_1 {

	public static void main(String[] args) {
		
		// create obj hashmap
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		
		hm.put(1, "Jan");
		hm.put(2, "Feb");
		hm.put(3, "Mar");
		hm.put(4, "Apr");
		hm.put(5, "May");
		hm.put(6, "Jun");
		hm.put(7, "Jul");
		hm.put(8, "Aug");
		hm.put(9, "Sep");
		hm.put(10, "Opt");
		hm.put(11, "Nov");
		hm.put(12, "Dec");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		System.out.println(hm.get(5));
		System.out.println(hm.get(6));
		System.out.println(hm.get(7));
		System.out.println(hm.get(8));
		System.out.println(hm.get(9));
		System.out.println(hm.get(10));
		System.out.println(hm.get(11));
		System.out.println(hm.get(12));

	}

}
