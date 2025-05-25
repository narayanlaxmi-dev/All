package day4inheritance;

public class EMPLOYEE {
	private int emp_id;
	protected int salary;
	private String name;

	public void set_data(int emp_id, String name, int salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}

	void get_data() {
		System.out.println("ID " + emp_id + "\tName " + name + "\tSalary " + salary);
	}
}

class BONUS extends EMPLOYEE {
	private float bonus, netsal;

	public void set_data() {
//		 	Scanner sc = new Scanner(System.in);
//
//	        System.out.print("Enter Employee ID: ");
//	        int emp_id = sc.nextInt();
//	        sc.nextLine();  // Consume newline left-over
//	        System.out.print("Enter Employee Name: ");
//	        String name = sc.nextLine();
//	        System.out.print("Enter Employee Salary: ");
//	        int salary = sc.nextInt();
		super.set_data(01, "Narayan", 50000);
		bonus = (float) (salary * 15 / 100);
		netsal = salary + bonus;
	}

	void get_data() {
		super.get_data();
		bonus = (float) (salary * 15 / 100);
		netsal = salary + bonus;
		System.out.println("\tBonus " + bonus + "\tNetSal " + netsal);
	}
}
