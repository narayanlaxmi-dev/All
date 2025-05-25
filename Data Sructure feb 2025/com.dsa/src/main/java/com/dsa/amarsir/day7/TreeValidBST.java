package com.dsa.amarsir.day7;

import java.util.Scanner;



class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class TreeValidBST {

	Node root;
	
	void addManual(Node r, int key, int data, String direction) {
		if (r == null) {
			System.out.println("Node with key " + key + " not found.");
			return;
		}

		if (r.data == key) {
			Node newNode = new Node(data);
			if (direction.equalsIgnoreCase("L")) {
				if (r.left == null) {
					r.left = newNode;
					System.out.println("Added " + data + " to the LEFT of " + key);
				} else {
					System.out.println("Left child already exists.");
				}
			} else if (direction.equalsIgnoreCase("R")) {
				if (r.right == null) {
					r.right = newNode;
					System.out.println("Added " + data + " to the RIGHT of " + key);
				} else {
					System.out.println("Right child already exists.");
				}
			} else {
				System.out.println("Invalid direction. Use 'L' or 'R'.");
			}
		} else {
			addManual(r.left, key, data, direction);
			addManual(r.right, key, data, direction);
		}
	}

	void inorder(Node r) {
		if (r != null) {
			inorder(r.left);
			System.out.print(r.data + " ");
			inorder(r.right);
		}
	}

	private boolean isValidBST(Node node, long min, long max) {
		if (node == null) {
			return true;
		}

		if (node.data <= min || node.data >= max) {
			return false;
		}

		return isValidBST(node.left, min, node.data) && isValidBST(node.right, node.data, max);
	}

	// Wrapper method to call isValidBST with the initial range
	public boolean isValidBST(Node root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static void main(String[] args) {
		TreeValidBST obj = new TreeValidBST();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter root node data:");
		int rootData = in.nextInt();
		obj.root = new Node(rootData);

		while (true) {
			System.out.println("Enter parent node, new node data, and direction (L/R) or -1 to stop:");
			int key = in.nextInt();
			if (key == -1)
				break;
			int data = in.nextInt();
			String direction = in.next();

			obj.addManual(obj.root, key, data, direction);
			System.out.println("Current Tree (Inorder Traversal):");
			obj.inorder(obj.root);
			System.out.println();
			obj.isValidBST(root,10,100);
		}
	}
}
