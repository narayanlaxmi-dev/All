package com.dsa.amarsir.day7;

public class ValidBinaryTree {
    Node root;
    public int count = 0;
    public int reafcount = 0;

    // Node class
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Insert method to create the BST
    void insert(Node r, Node n) {
        if (root == null)
            root = n;
        else {
            if (n.data < r.data) { // Insert on the left subtree
                if (r.left == null)
                    r.left = n;
                else
                    insert(r.left, n);
            } else { // Insert on the right subtree
                if (r.right == null)
                    r.right = n;
                else
                    insert(r.right, n);
            }
        }
    }

    // Search for a node with a specific key
    boolean search(Node r, int key) {
        if (r == null) {
            return false;
        }
        if (key == r.data) {
            return true;
        } else if (key < r.data) {
            return search(r.left, key);
        } else {
            return search(r.right, key);
        }
    }

    // Inorder traversal (LPR)
    void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ,");
            inorder(r.right);
        }
    }

    // Preorder traversal (PLR)
    void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data + " ,");
            preorder(r.left);
            preorder(r.right);
        }
    }

    // Postorder traversal (LRP)
    void postorder(Node r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ,");
        }
    }

    // Count nodes
    int count_node(Node r) {
        count = 0;  // Reset count before counting
        count_nodeHelper(r);
        return count;
    }

    // Helper method to count nodes recursively
    private void count_nodeHelper(Node r) {
        if (r != null) {
            count_nodeHelper(r.left);
            count++;
            count_nodeHelper(r.right);
        }
    }

    // Count leaf nodes
    int count_leaf(Node r) {
        reafcount = 0;  // Reset leaf count before counting
        count_leafHelper(r);
        return reafcount;
    }

    // Helper method to count leaf nodes recursively
    private void count_leafHelper(Node r) {
        if (r != null) {
            if (r.left == null && r.right == null) { // Leaf node check
                reafcount++;
            }
            count_leafHelper(r.left);
            count_leafHelper(r.right);
        }
    }

    // Find minimum node in the tree
    Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Delete a node from the BST
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
                Node successor = findMin(root.right); // Inorder Successor
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }

        return root;
    }

    // Method to check if the tree is a valid BST
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

    // Main method to test the tree
    public static void main(String[] args) {
        ValidBinaryTree obj = new ValidBinaryTree();

        // Insert nodes into the BST
        obj.insert(obj.root, new Node(20));
        obj.insert(obj.root, new Node(10));
        obj.insert(obj.root, new Node(30));
        obj.insert(obj.root, new Node(5));
        obj.insert(obj.root, new Node(15));
        obj.insert(obj.root, new Node(40));

        // Tree traversals
        System.out.println("Inorder Traversal:");
        obj.inorder(obj.root);
        System.out.println("\n-----");
        System.out.println("Postorder Traversal:");
        obj.postorder(obj.root);
        System.out.println("\n-----");
        System.out.println("Preorder Traversal:");
        obj.preorder(obj.root);

        // Count the nodes and leaf nodes
        System.out.println("\n");
        System.out.println("The Count of Tree Nodes: " + obj.count_node(obj.root));
        System.out.println("The Count of Tree Leaf Nodes: " + obj.count_leaf(obj.root));

        // Check if the tree is a valid BST
        boolean isValid = obj.isValidBST(obj.root);
        System.out.println("Is the tree a valid BST? " + isValid);
    }
}
