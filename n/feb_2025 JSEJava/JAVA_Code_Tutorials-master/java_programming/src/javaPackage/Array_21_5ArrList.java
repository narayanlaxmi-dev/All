package javaPackage;

//import java.util.*; // .* means java all lib available or
import java.util.ArrayList;
import java.util.Iterator;

// array list used when size not to be limited
public class Array_21_5ArrList {

	public static void main(String[] args) {
		
		//creating array list object first you hat to import .arraylist
		ArrayList<Object> obj= new ArrayList<Object>();
		
		//Adding object in arrayList
		obj.add(obj); // collection of all object Value
		obj.add("Selenium N");
		obj.add(1221);
		obj.add('c');
		obj.add(9.43);
		obj.add(3 > 1);
		
		// printing all value in same line
		System.out.println(obj);
		
		// 1 Way using for loop
		for(Object xyz : obj) {
			System.out.println("using for each loop "+ xyz);
		}
		
		// 2 Way using Iterator 
		Iterator<Object> abc = obj.iterator();
		while (abc.hasNext()) {
			System.out.println(abc.next());
		}

	}

}
