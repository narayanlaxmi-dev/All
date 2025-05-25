package day7;

import java.util.Scanner;
import java.util.ArrayList;

public class arrList1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList obj = new ArrayList();
		ArrayList obj2 = new ArrayList();
		obj.add(100);
		obj.add("nara");
		obj.add(12.2);
		System.out.println(" print arraylist :\n" + obj);
		System.out.println(" Size of arraylist :" + obj.size());
		int a = 1, n;
		String str;
//		while (a<5) {
//		System.out.println("Enter number :");
//		 n = sc.nextInt();
//		 obj.add(n);
//		 System.out.println("Enter string :");
//		 str =sc.next();
//		 obj.add(str);
//			a++;
//		}

		obj.add(0, 9999); // shift right position
		System.out.println("the array inserted \n:" + obj);
		obj.add(0, "narayan"); // shift right position
		System.out.println("the array inserted \n:" + obj);
		System.out.println(" Size of arraylist :" + obj.size());
		obj2.add("second obj");
		obj2.add(1100);
		obj.add(obj2);
		System.out.println("add 1 obj to another \nvalue :" + obj + "\nsize :" + obj.size());
		
		System.out.println("available or not \n:" + obj.contains(100));
		System.out.println("-----0-> or not \n:" + obj.contains(obj2)); // [second obj, 1100]
		System.out.println("value index value get : "+ obj.indexOf(100));
		System.out.println("value index value get : "+ obj.indexOf("nara"));
		obj.remove(obj2);
		System.out.println("removed objected -> :"+ obj);
		System.out.println("get remove  : "+ obj.remove(2)+"\nlist :-"+ obj);
		obj.clear();
		System.out.println( "the list is clear(); "+ obj);
		Object a1 = obj2.clone();
		System.out.println("clone: "+(a1));
		obj2.addFirst("first ele");
		obj2.addLast("last ele");
		System.out.println(obj2);
		
		
	}

}
