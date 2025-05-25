package day5;

public class EMPLOYEE {
	private int emp_id;
	private String emp_name;
	protected float salary;

	EMPLOYEE() {

	}

	EMPLOYEE(int emp_id, String emp_name, float salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}

	void display() {
		System.out.println("EMP ID: " + emp_id + "\nEmp NAME : " + emp_name + "\nEMP salary : " + salary);
	}
}

class BONUS extends EMPLOYEE {
	protected float bonus;

	BONUS() {
		super(01, "narayan", 10001.50f); // parameter passed
	}

	void set() {
		if (salary > 10000)
			bonus = salary * 35 / 100;
		else
			bonus = salary * 10 / 100;
	}

	void display() {
		super.display();
		System.out.println("\tBonus :--->	" + bonus);
	}
}

class PAYMENT extends BONUS {
	private float netsalary;

	void set() {
		super.set();
		netsalary = salary + bonus;
	}

	void display() {
		super.display();
		System.out.println("\tNET SALARY :	" + netsalary);
	}
}