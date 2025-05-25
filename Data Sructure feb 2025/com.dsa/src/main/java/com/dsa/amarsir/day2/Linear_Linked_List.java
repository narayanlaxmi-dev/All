package com.dsa.amarsir.day2;

public class Linear_Linked_List {

	Node root;// never lose it or else all lost

	void insert_left(int data) {
		Node n = new Node(data);// 1
		if (root == null)// not created
			root = n;// root is assigned not created ,it is first from either side
		else {
			n.next = root;// 1
			root = n;
		}
	}

	void delete_left() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			Node t = root;// 1
			root = root.next;// 2
			System.out.print(t.data + " deleted");
		}
	}

	void insert_right(int data) {
		Node n = new Node(data);// 1
		if (root == null)// not created
			root = n;// root is assigned not created ,it is first from either side
		else {
			Node t = root;// 1
			while (t.next != null)// 2
				t = t.next;
			t.next = n;// 3
		}
	}

	void delete_right() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			Node t = root;// 1
			Node t2 = root;// 1
			while (t.next != null) {
				t2 = t;
				t = t.next;
			}
			if (t == root)// single Node
				root = null;// reset root
			else
				t2.next = null;
			System.out.print(t.data + " deleted");
		}
	}

	void print_list() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			Node t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

	boolean search_list(int key)// true if found else false
	{
		if (root == null)// not created
		{
			System.out.println("\nEmpty List");
			return false;
		} else {
			Node t = root;
			while (t != null) {
				if (key == t.data)
					return true;
				t = t.next;
			}
			return false;
		}
	}

	void insert_after(int ref, int new_element) {
		if (root == null)// not created
		{
			System.out.println("\nEmpty List");
		} else {
			Node t = root;
			while (t.data != ref) {
				t = t.next;
			}
			if (t == null) {
				System.out.println("not found");
			} else// found
			{
				Node n = new Node(new_element);
				n.next = t.next;// 3
				t.next = n;// 4
			}

		}
	}

	void delete_element(int element) {
		if (root == null)// not created
		{
			System.out.println("\nEmpty List");
		} else {
			Node t = root;
			Node t2 = root;
			while (t != null) {
				if (element == t.data)
					break;
				t2 = t;
				t = t.next;
			}
			if (t == null)// not found
				System.out.println("\nNot found");
			else // found
			{
				if (t == root)// case1
					root = root.next;
				else if (t.next == null)// case2
					t2.next = null;
				else// case 3
					t2.next = t.next;
				System.out.println(t.data + " deleted");
			}

		}
	}

	void sort_list() {
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
