package assignment8;

import java.util.ArrayList;
import java.util.Scanner;


interface Payroll {
    double calculateSalary();
}


class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}


abstract class Company {
    protected static final String COMPANY_NAME = "MET IIT Nashik.";


    public void showCompanyDetails() {
        System.out.println("Company Name: " + COMPANY_NAME);
        System.out.println("Industry: IT Education");
    }

   
    public abstract void showEmployeeType();
}


class Employee {
    private int empId;
    private String name;
    protected double salary;

    public Employee(int empId, String name, double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative!");
        }
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class FullTimeEmployee extends Company implements Payroll {
    private Employee employee;

    public FullTimeEmployee(int empId, String name, double salary) throws InvalidSalaryException {
        employee = new Employee(empId, name, salary);
    }

    @Override
    public double calculateSalary() {
        return employee.salary;  
    }

    @Override
    public void showEmployeeType() {
        System.out.println("Employee Type: Full-Time");
    }

    public void display() {
        showEmployeeType();
        employee.showEmployeeDetails();
        System.out.println("Net Salary: " + calculateSalary());
    }
}


class PartTimeEmployee extends Company implements Payroll {
    private Employee employee;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int empId, String name, int hoursWorked, double hourlyRate) throws InvalidSalaryException {
        employee = new Employee(empId, name, hoursWorked * hourlyRate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;  
    }

    @Override
    public void showEmployeeType() {
        System.out.println("Employee Type: Part-Time");
    }

    public void display() {
        showEmployeeType();
        employee.showEmployeeDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Net Salary: " + calculateSalary());
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Company> employees = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT MENU =====");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. View Employees");
            System.out.println("4. Display Company Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Employee ID: ");
                        int empId = scanner.nextInt();
                        scanner.nextLine();  
                        System.out.print("Enter Employee Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();

                        employees.add(new FullTimeEmployee(empId, name, salary));
                        System.out.println("Full-Time Employee Added Successfully!");
                    } catch (InvalidSalaryException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter Employee ID: ");
                        int empId = scanner.nextInt();
                        scanner.nextLine();  // if we dont give some times it will misbehaves between to nextLIne commands
                        System.out.print("Enter Employee Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Hours Worked: ");
                        int hoursWorked = scanner.nextInt();
                        System.out.print("Enter Hourly Rate: ");
                        double hourlyRate = scanner.nextDouble();

                        employees.add(new PartTimeEmployee(empId, name, hoursWorked, hourlyRate));
                        System.out.println("Part-Time Employee Added Successfully!");
                    } catch (InvalidSalaryException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("No Employees Found!");
                    } else {
                        System.out.println("\n===== Employee List =====");
                        for (Company emp : employees) {
                            if (emp instanceof FullTimeEmployee) {
                                ((FullTimeEmployee) emp).display();
                            } else if (emp instanceof PartTimeEmployee) {
                                ((PartTimeEmployee) emp).display();
                            }
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 4:
                    if (!employees.isEmpty()) {
                        employees.get(0).showCompanyDetails();
                    } else {
                        System.out.println("No Employees Added Yet.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}