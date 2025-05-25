package practice;

import java.util.Scanner;

import com.dsa.amarsir.day2.Node;

public class LinkedListCircluar {
	Node root;

	void createNodeInsertLeft(int d) {
		Node n = new Node(d);
		if (root == null) {
			root = n;
			root.next = root;
		} else {
			Node temp = root;
			while (temp.next != root)
				temp = temp.next;
			n.next = root;
			temp.next = n;
			root = n;

		}
	}

	void createNodeInsertRight(int d) {
		Node n = new Node(d);
		if (root == null) {
			root = n;
			root.next = root;
		} else {
			Node t = root;
			while (t.next != root)
				t = t.next;

			t.next = n;
			n.next = root;

		}
	}
	  // Delete from beginning
    void deleteLeft() {
        if (root == null) {
            System.out.println("Empty list");
        } else if (root.next == root) {
            System.out.println(root.data + " deleted");
            root = null;
        } else {
            Node temp = root;
            while (temp.next != root) {
                temp = temp.next;
            }
            System.out.println(root.data + " deleted");
            temp.next = root.next;
            root = root.next;
        }
    }

    // Delete from end
    void deleteRight() {
        if (root == null) {
            System.out.println("Empty list");
        } else if (root.next == root) {
            System.out.println(root.data + " deleted");
            root = null;
        } else {
            Node prev = null;
            Node temp = root;
            while (temp.next != root) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = root;
            System.out.println(temp.data + " deleted");
        }
    }

	void print_likedlist() {

		Node t = root;
		if (t == null)
			System.out.println("LinkedList empty");
		else {
			while (t != null) {
				System.out.print(" | " + t.data + " |->");
				t = t.next;
			}
		}
	}

	void countNode() {
		int count = 0;
		Node t = root;
		if (t == null)
			System.out.println("Empty");
		else {
			while (t != null) {
				count++;
				t = t.next;
			}
			System.out.println("Total count is: " + count);
		}
	}

	void countOddDataNode() {
		int oddCount = 0;
		Node t = root;
		if (t == null)
			System.out.println("Empty");
		else {
			while (t != null) {
				if (t.data % 2 != 0)
					oddCount++;
				t = t.next;

			}
			System.out.println("Total count is: " + oddCount);
		}
	}

	public static void main(String[] args) {
		LinkedListCircluar obj = new LinkedListCircluar();
		boolean exit = true;
		Scanner in = new Scanner(System.in);

		while (exit) {
			System.out.print("\n----MENU-------\n" + "1 : Insert Node");
			System.out.print("\n11  : Delete lefy Node");
			System.out.print("\n2   : Insert Right Node");
			System.out.print("\n3   : Print list");
			System.out.print("\n4   : count node");
			System.out.print("\n5   : count odd");
			System.out.print("\n0   : Exit");
			System.out.print("\nChoice :");
			int ch = in.nextInt();

			switch (ch) {
			case 0:
				System.out.println("Exiting...");
				exit = false;
				break;
			case 1:
				System.out.println("Enter data to insert: ");
				obj.createNodeInsertLeft(in.nextInt());
				break;
			case 11:
				obj.deleteLeft();

			case 2:
				System.out.println("Enter data to Right Side delete: ");
				obj.createNodeInsertRight(in.nextInt());
				break;
			case 3:
				
				obj.deleteRight();
				break;
			case 4:
				obj.print_likedlist();

				break;
			case 5:
				System.out.println("Count nodes");
				obj.countNode();
				break;
			case 6:
				System.out.println("Count Odd data nodes");
				obj.countOddDataNode();
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}

	}

}
