package practice;

import java.util.Scanner;

import com.dsa.amarsir.day2.Node;

public class LinkedListCountAndOddValue {
	Node root;

	void createNodeInsertLeft(int d) {
		Node n = new Node(d);
		if (root == null)
			root = n;
		else
			n.next = root;
		root = n;

	}

	void createNodeInsertRight(int d) {
		Node n = new Node(d);
		if (root == null)
			root = n;
		else {
			Node t = root;
			while (t != null)
				t = t.next;

			t.next = n;

		}
	}

	void deleteNodedeLeft(int data) {
		if (root == null)
			System.out.println("Empty list");
		else {
			Node t = root;// 1
			root = root.next; // 2 linked up break from t
			System.out.print(t.data + " deleted");
		}
	}

	void deleteNodeRight(int d) {
		Node n = new Node(d);
		if (root == null)
			root = n;
		else {
			Node t = root;
			Node t2 = root;
			while (t != null) {
				t2 = t;
				t = t.next;
			}
			t.next = t2;

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
		LinkedListCountAndOddValue obj = new LinkedListCountAndOddValue();
		boolean exit = true;
		Scanner in = new Scanner(System.in);

		while (exit) {
			System.out.print("\n----MENU-------\n" + "1 : Insert Node");
			System.out.print("\n2  : Delete Node");
			System.out.print("\n11 : Insert Right Node");
			System.out.print("\n : delete Right Node");
			System.out.print("\n3  : Print list");
			System.out.print("\n4  : count node");
			System.out.print("\n5  : count odd");
			System.out.print("\n0  : Exit");
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
				System.out.println("Enter data to left Side insert: ");
				obj.deleteNodedeLeft(in.nextInt());

			case 2:
				System.out.println("Enter data to Right Side delete: ");
				obj.createNodeInsertRight(in.nextInt());
				break;
			case 3:
				System.out.println("Enter data to right Side delete: ");
				obj.deleteNodeRight(in.nextInt());
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
