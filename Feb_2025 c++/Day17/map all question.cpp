/*Problem Statement: Employee Management System
Company: CG Company & Infosys
Objective:
 Develop an Employee Management System using Object-Oriented Programming (OOP) concepts and STL (Standard Template Library) Map in C++. This system should allow registering employees, searching for employees, deleting employees, and updating employee details using a menu-driven approach.
Functional Requirements:
Register Employee:

Inputs: Name (string), Gender (char), Salary (double), Position (string).
Generates a unique Employee ID (int) automatically.
Stores the employee details in an unordered_map<int, Employee>.
Search Employee:

Search for an employee using the Employee ID.
If found, display the employee's details.
If not found, show an appropriate message.
Delete Employee:

Remove an employee record from the system using the Employee ID.
Update Employee Details:

Modify details such as Name, Gender, Salary, and Position for an existing employee.
Menu-Driven System:

The program should run in a loop, allowing the user to choose operations from a menu.
Provide options to exit the system safely.
Technical Requirements:
Use C++ OOP principles such as Encapsulation, Abstraction, and Classes.
Utilize STL Map to store and manage employee records efficiently.
Ensure exception handling for invalid inputs and operations.
Implement a clear and user-friendly menu.
Expected Output:
When an employee is registered, the system should generate and display a unique Employee ID.
When searching for an employee, the system should return the corresponding details.
When deleting an employee, the system should confirm the deletion.
When updating an employee, the system should reflect the changes accurately.
This Employee Management System will streamline the process of managing employees in CG Company & Infosys, improving efficiency and organization.
*/
#include<iostream>
#include<map>
using namespace std;

class Employee {
private:
    int id;
    static int emp_id;
    double salary;
    char gender;
    string name, position;

public:
    Employee() {}

    Employee(string name, char gender, double salary, string position) {
        this->name = name;
        this->gender = gender;
        this->salary = salary;
        this->position = position;
        id = (++emp_id);
    }

    int get_id() const {
        return id;
    }

    void update_employee(string name, char gender, double salary, string position) {
        this->name = name;
        this->gender = gender;
        this->salary = salary;
        this->position = position;
    }

    void display() const {
        cout << "Emp ID: " << id
             << "\nName: " << name
             << "\nGender: " << gender
             << "\nSalary: " << salary
             << "\nPosition: " << position << endl;
    }
};

// Static variable initialization
int Employee::emp_id = 200;

int main() {
    string n;
    char g;
    double s;
    string p;
    map<int, Employee> employee_list;

    while (true) {
        cout << "1: Registering employees\n"
             << "2: Searching for employees\n"
             << "3: Deleting employees\n"
             << "4: Updating employee\n"
             << "5: Exit\n";

        int ch;
        cin >> ch;

        if (ch == 1) {
            cout << "Register employee name: ";
            cin >> n;
            cout << "Enter employee gender: ";
            cin >> g;
            cout << "Register employee salary: ";
            cin >> s;
            cout << "Register employee position: ";
            cin >> p;

            Employee e(n, g, s, p);
            int id = e.get_id();
            employee_list[id] = e;

            cout << "Employee Registered Successfully! Employee ID: " << id << endl;
        } else if (ch == 2) {
            int search_id;
            cout << "Enter Employee ID to search: ";
            cin >> search_id;

            if (employee_list.find(search_id) != employee_list.end()) {
                employee_list[search_id].display();
            } else {
                cout << "Employee not found." << endl;
            }
        } else if (ch == 3) {
            int del_id;
            cout << "Enter Employee ID to delete: ";
            cin >> del_id;

            if (employee_list.erase(del_id)) {
                cout << "Employee deleted successfully." << endl;
            } else {
                cout << "Employee not found." << endl;
            }
        } else if (ch == 4) {
            int update_id;
            cout << "Enter Employee ID to update: ";
            cin >> update_id;

            if (employee_list.find(update_id) != employee_list.end()) {
                cout << "Update employee name: ";
                cin >> n;
                cout << "Enter employee gender: ";
                cin >> g;
                cout << "Update employee salary: ";
                cin >> s;
                cout << "Update employee position: ";
                cin >> p;

                employee_list[update_id].update_employee(n, g, s, p);
                cout << "Employee updated successfully." << endl;
            } else {
                cout << "Employee not found." << endl;
            }
        } else if (ch == 5) {
            cout << "Exiting..." << endl;
            break;
        } else {
            cout << "Invalid choice. Please try again." << endl;
        }
    }

    return 0;
}
