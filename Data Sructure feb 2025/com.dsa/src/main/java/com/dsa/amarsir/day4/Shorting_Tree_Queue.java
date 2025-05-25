package com.dsa.amarsir.day4;

public class Shorting_Tree_Queue {
	Node root;

	void insert(Node r, Node n) {
		if (root == null)
			root = n;
		else { // one need to place usingBST
			if (n.data < r.data) {// left
				if (r.left == null)
					r.left = n;
				else // not empty
					insert(r.left, n);
			} else { // right
				if (r.right == null)
					r.right = n;// insert right
				else
					insert(r.right, n);
			}
		}
	}

	void inorder(Node r) { // LPR
		if (r != null) {
			inorder(r.left);
			System.out.print(r.data + " ,");
			inorder(r.right);
		}
	}

	void sortUsingBST(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			insert(root, new Node(arr[i]));
		}
		inorder(root);
	}
	
	public static void main(String[] args) {
		int arr[]= {23,45,65,23,1,32,43,2,3,5,87,45};
		Shorting_Tree_Queue obj = new Shorting_Tree_Queue();
		System.out.println("Sorted BST:");
		obj.sortUsingBST(arr);
		
	}
}
