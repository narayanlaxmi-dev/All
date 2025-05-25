package com.dsa.amarsir.day7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReversingLinkedList {
	public static void main(String[] args) {
		LinkedList<Character> linkedList = new LinkedList<>();
		LinkedList<Integer> list = new LinkedList<>();
		Scanner in = new Scanner(System.in);

		linkedList.add('n');
		linkedList.add('a');
		linkedList.add('r');
		linkedList.add('a');
		linkedList.add('y');
		linkedList.add('a');
		linkedList.add('n');

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
//		System.out.println("Enter String: ");
//		String str = in.nextLine();
//		for (char c : str.toCharArray()) {
//			linkedList.add(c);
//		}
		System.out.println( linkedList.toString());
		System.out.println( list.toString());

		Collections.reverse(linkedList);
		Collections.rotate(list, 3);

		// Output the reversed string
		System.out.println("Reversed String: " + linkedList.toString());
		System.out.println("Reversed String: " + list.toString());

	}

}
