package com.dsa.amarsir.day2;

public class Linear_LinkedList {

	Node root;// never lose it or else all lost

	void insert_left(int data) {
		Node n = new Node(data);// 1
		if (root == null)// not created
			root = n;// root is assigned not created ,it is
		else // first from either side else
		{
			n.next = root;// 1
			root = n;
		}
	}

	void delete_left() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			Node t = root;// 1
			root = root.next; // 2 linked up break from t
			System.out.print(t.data + " deleted");
		}
	}

	void insert_right(int data) {
		Node n = new Node(data);// 1
		if (root == null)// not created
			root = n;// root is assigned not created ,it is first from either side else
		{

			Node t = root; // 1 temp is root
			while (t.next != null) // t increment till null is find
				t = t.next;
			t.next = n;// assign t to n
		}
	}

	void delete_right() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			Node t = root;
			Node t2 = root;
			while (t.next != null) {
				t2 = t;
				t = t.next;// last node where null find
			}

			if (t == root)// single node
				root = null;// reset root
			else
				t2.next = null; // break t2 and t
			System.out.print(t.data + " deleted");
		}
	}

	void print_likedlist() {

		Node t = root;
		if (t == null)
			System.out.println("LinkedList empty");
		else {
			while (t != null) {
				System.out.println(" | " + t.data + " | ");
				t = t.next;
			}
		}

	}

	boolean search_Key(int key) {

		Node t = root;
		while (t != null) {
			if (t.data == key)
				return true;
			t = t.next;

		}

		return false;
	}
	/*
	 * // insert_AFter if (root == null) { System.out.println("\nEmpty List"); }
	 * else { Node t=root; while(t.data!=ref) { t=t.next; } if(t==null) {
	 * System.out.println("not found"); } else { Node n=new Node(new_element);
	 * n.next=t.next; t.next=n; } } }
	 */

	void insert_after(int ref, int element) {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			boolean flag = false;
			Node t = root;
			while (t != null) {
				if (t.data == ref) {
					// found
					Node n = new Node(element);
					n.next = t.next;// 3 n link after
					t.next = n;// 4 n link before
					flag = true;
					System.out.println("Value Added Successfully");
				}
			}
			if (!flag)
				System.out.println("Not Found");
		}
	}

	void delete_element(int data) {

		if (root == null)
			System.out.println("LinkedList empty");
		else {
			Node t = root;
			Node t2 = root;
			while (t != null) {
				if (t.data == data)
					break;
				t2 = t;
				t = t.next;
			}

			if (t == null)
				System.out.println("Not Found");
			else {
				if (t == root)
					root = root.next;
				else if (t.next == null)
					t2.next = null;
				else
					t2.next = t.next;
				System.out.println(t.data + " deleted");

			}
		}
	}

	void sorting_List() {
		if (root == null)// not created
		{
			System.out.println("\nEmpty List");
		} else {
			for (Node i = root; i != null; i = i.next) {
				for (Node j = i.next; j != null; j = j.next) {
					if (j.data < i.data) {
						int temp = i.data;
						i.data = j.data;
						j.data = temp;
					}
				}
			}
		}
	}
}
