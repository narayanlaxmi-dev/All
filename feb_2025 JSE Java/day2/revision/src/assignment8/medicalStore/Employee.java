package assignment8.medicalStore;

public class Employee {
	protected String name;
	protected String role;

	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public void showEmployeeDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee role: " + role);
	}
}
