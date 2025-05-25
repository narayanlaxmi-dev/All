package com.dsa.amarsir.day3;

public class Circular_Linked_List {
	Node root, last;// never lose it or else all lost

	void insert_left(int data) {
		Node n = new Node(data);// 1
		if (root == null) {// not created
			root = n;// root is assigned not created ,it is first from either side

			last = n;
			last.next = root;
		} else {
			n.next = root;// 1
			root = n;
			last.next = root;
		}
	}

	void delete_left() {
		if (root == null) {// not created
			System.out.println("\nEmpty List");
		} else {
			Node t = root;// 1
			if (root == last)
				root = last = null;
			else {
				root = root.next;// 2
				last.next = root; // 3
				System.out.print(t.data + " deleted");
			}
		}
	}

	void insert_right(int data) {
		Node n = new Node(data);// 1
		if (root == null) {// not created
			root = n;// root is assigned not created ,it is first from either side
			last = n;
			last.next = root;

		} else {
			Node t = root;// 1
			last.next = n;
			last = n;
			last.next = root;

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

			while (t.next != last) {
				t2 = t;
				t = t.next;
			}

			if (t == root)// single Node
				root = last = null;// reset root
			else {
				t2.next = null;
				last = t2;
				last.next = root;
			}
			System.out.print(t.data + " deleted");
		}
	}

	void print_list() {
		if (root == last)// not created
			System.out.println("\nEmpty List");
		else {
			Node t = root;
			do {
				System.out.print("|" + t.data + "| -> ");
				t = t.next;
			} while (t != root);

		}
	}
}
