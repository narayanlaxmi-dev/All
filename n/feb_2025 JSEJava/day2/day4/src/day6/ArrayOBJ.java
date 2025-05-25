package day6;

import java.util.Scanner;

public class ArrayOBJ {
	private int emp_id, sal, att[], tot;
	private String name;

	public void set(int emp_id, String name, int sal) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id:");
		this.emp_id = emp_id = sc.nextInt();
		this.name = name;
		this.sal = sal;

		att = new int[6];
		System.out.println("Enter employee attendence in 6 months: ");
		for (int i = 0; i < att.length; i++) {
			att[i] = sc.nextInt();
			tot += att[i];
		}
		sc.close();
	}

	void show() {
		System.out
				.println("NAME :" + name + "\t EMP id:" + emp_id + "\nSALARY :" + sal + "\t TOTAL Days PRESENT:" + tot);
	}

}
