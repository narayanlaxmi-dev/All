package com.dsa.amarsir.day4;

public class TreeClass {
	Node root;
	public int count = 0;
	public int reafcount = 0;

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

	boolean search(Node r, int key) {
		if (root == null)
			return false;

		if (r == null)
			return false;
		else {
			if (key == r.data)
				return true;
			else {
				if (key < r.data) // left
					return search(r.left, key);
				else // right (key > r.data)
					return search(r.right, key);
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

	void preorder(Node r) { // PLR
		if (r != null) {
			System.out.print(r.data + " ,");
			preorder(r.left);
			preorder(r.right);
		}
	}

	void postorder(Node r) { // LRP
		if (r != null) {
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.data + " ,");
		}
	}

	int count_node(Node r) { // LPR
		if (r != null) {
			count_node(r.left);
			this.count++;
			count_node(r.right);
		}
		return count;
	}

	int count_leaf(Node r) { // LPR
		if (r != null) {
			count_leaf(r.left);
			if (r.left == null && r.right == null)
				this. reafcount++;
			count_leaf(r.right);
		}
		return reafcount;
	}
//	----------------------------------------------------------------------------
	Node findMin(Node node) {
	    while (node.left != null) {
	        node = node.left;
	    }
	    return node;
	}
	Node delete(Node root, int key) {
	    if (root == null)
	        return null;

	    if (key < root.data) {
	        root.left = delete(root.left, key);
	    } else if (key > root.data) {
	        root.right = delete(root.right, key);
	    } else {
	        // Node to be deleted found

	        // Case 1: Node has no child (Leaf)
	        if (root.left == null && root.right == null) {
	            return null;
	        }

	        // Case 2: Node has one child
	        else if (root.left == null) {
	            return root.right;
	        } else if (root.right == null) {
	            return root.left;
	        }

	        // Case 3: Node has two children
	        else {
	            Node successor = findMin(root.right);  // Inorder Successor
	            root.data = successor.data;
	            root.right = delete(root.right, successor.data);
	        }
	    }

	    return root;
	}
//	----------------------------------------------------------------------------
	
	public static void main(String[] args) {
		TreeClass obj = new TreeClass();
		obj.insert(obj.root, new Node(10));
		obj.insert(obj.root, new Node(100));
		obj.insert(obj.root, new Node(20));
		obj.insert(obj.root, new Node(50));
		obj.insert(obj.root, new Node(40));
		obj.insert(obj.root, new Node(50));
		System.out.println("Tree is:");
		obj.inorder(obj.root);
		System.out.println("\n-----");
		obj.postorder(obj.root);
		System.out.println("\n-----");
		obj.preorder(obj.root);

		System.out.println("\n");
		System.out.println("The Count of Tree Node:"+obj.count_node(obj.root));
		System.out.println("The Count of Tree Leaf:"+obj.count_leaf(obj.root));
	}
}
