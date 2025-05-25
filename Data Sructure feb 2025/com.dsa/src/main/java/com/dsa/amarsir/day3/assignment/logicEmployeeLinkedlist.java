package com.dsa.amarsir.day3.assignment;

import java.util.Scanner;

public class logicEmployeeLinkedlist {
	DNode root;// never lose it or else all lost

	// create new employee
	public void registration(Employee newData) {
		DNode n = new DNode(newData);// 1
		if (root == null)
			root = n;
		else {
			n.next = root;
			root = n;
			System.out.println("Sucessfully Registered");
		}
	}

	// print all
	void PrintAllElement() {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			DNode t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

	// search by id
	void search_EmployeeById(int key) {
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			DNode t = root;
			while (t != null) {
				if (key == t.data.getEmployeeID())
					System.out.print("|" + t.data + "| ->");
				t = t.next;

			}
		}
	}

	// update by id
	void updateById(int id) {
		boolean f = false;
		if (root == null)// not created
			System.out.println("\nEmpty List");
		else {
			DNode t = root;
			while (t != null) {
				if (id == t.data.getEmployeeID()) {
					//
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter new name: ");
					String obj;
					t.data.setName(obj = sc.next());
					System.out.println("Enter gender: ");
					t.data.setGender(obj = sc.next());
					System.out.println("Enter Position: ");
					t.data.setPosition(obj = sc.next());
					System.out.println("Enter Salary: ");
					double sal = sc.nextDouble();
					t.data.setSalary(sal);
					System.out.println("Employee updated.");
					f = true;
				}
				t = t.next;
			}
			if (!f)
				System.out.println("ID not found");
		}
	}

	// delete by id
	void deleteById(int element) {
		if (root == null)// not created
		{
			System.out.println("\nEmpty List");
		} else {
			DNode t = root;
			DNode t2 = root;
			while (t != null) {
				if (element == t.data.getEmployeeID())
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

}
