package com.dsa.amarsir.day3.assignment;

public class Employee {
	private int EmployeeID;
	private String name;
	private String gender;
	private String position;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeID, String name, String gender, String position, double salary) {
		super();
		EmployeeID = employeeID;
		this.name = name;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", name=" + name + ", gender=" + gender + ", position=" + position
				+ ", salary=" + salary + "]";
	}

}
