package com.dsa.amarsir.day3;

public class Doubly_linked_List {
	DNode root;// never lose it or else all lost

	void insert_left(int data) {
		DNode n = new DNode(data);// 1
		if (root == null) {// not created
			root = n; // root is assigned not created ,it is first from either side

		} else {
			n.right = root;// 1
			root.left = n;
			root = n;
		}
	}

	void delete_left() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			DNode t = root;// 1
			root = root.right;// 2
			if (root != null)
				root.left = null;
			System.out.print(t.data + " deleted");
		}
	}

	void insert_right(int data) {
		DNode n = new DNode(data);// 1
		if (root == null)// not created
			root = n;// root is assigned not created ,it is first from either side
		else {
			DNode t = root;// 1
			while (t.right != null)// 2
				t = t.right;
			t.right = n;// 3
			n.left = t;// 4

		}
	}

	void delete_right() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			DNode t = root;// 1
			DNode t2 = root;// 1
			while (t.right != null) {
				t2 = t;
				t = t.right;
			}
			if (t == root)// single DNode
				root = null;// reset root
			else
				t2.right = null;
			System.out.print(t.data + " deleted");
		}
	}

	void print_list() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			DNode t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.right;
			}
		}
	}

	void print_list_Reverse() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			DNode t = root;
			while (t != null) 
				t = t.right;
			
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.left;
			}
		}
	}
}
