package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import SortdTreeSet.Country;

//user  class in api collection
public class ReflectionAdvancedExampleMain {

	private static void printClassinfo(Object obj) {
		// this method print the information of clas
//		which an obj is recived using refrence OBJ
		System.out.println("-=-=-=-=-=-=-=-=-=-==--=-=-==-=--=-==--=-=-=-=-=-=-");
		Class currentClass = obj.getClass();
		System.out.println("class Name: " + currentClass.getName());

		System.out.println("---------- printing method names -----------"); // country class method display
		Method[] allMethod = currentClass.getDeclaredMethods(); // declared methods get here
		for (Method currMethod : allMethod) {
//			System.out.println(currMethod.getName());
			String aa = currMethod.getName();
			System.out.println("Metohds are :-" + aa);
		}
		System.out.println("---------- printing Fields names -----------");
		Field[] allField = currentClass.getDeclaredFields(); // declared fields get here
		for (Field currField : allField) {
			System.out.println("Fields are :- " + currField.getName());
		}
	}

	public static void main(String[] args) {
		printClassinfo("hiiiiiihi");
//		printClassinfo(true);
//		printClassinfo(241123);
		printClassinfo(new Country());
	}

}
