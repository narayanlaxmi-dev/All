package day7;

import java.util.Vector;
import java.util.Scanner;

public class Vector_lst2 {

	public static void main(String[] args) {
		Vector vob = new Vector();
		vob.add(100);
		vob.add("nara");
		vob.add(12.2);
		System.out.println(" print vector :" + vob);
		System.out.println(" Size of vector :" + vob.size());
		vob.add(1, 5454); // particular index
		vob.addFirst("first");
		vob.addFirst("last");
		System.out.println(vob);
		Vector vob2 = new Vector();
		vob2.add("1");
		vob2.add(.989);
		vob2.add(2);
		System.out.println(vob2 + "\nvector size :" + vob2.size());
		vob.add(vob2);
		System.out.println("concinated vectros : " + vob);
		System.out.println("dont konw  really : " + vob.add(vob2));
		System.out.println("total size " + vob.size());
		System.out.println("total capicity " + vob.capacity());

		System.out.println(vob);
	}

}
