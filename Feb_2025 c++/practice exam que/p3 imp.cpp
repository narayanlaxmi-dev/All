/*Write a c++ program to create a 
base class Employee(Emp-Code, Name, Salary).
 Derive two classes as 
Fulltime (daily_wages, number_of_days) and 
Parttime (number_of_working_hours, hourly_wages).
Write a menu driven program to perform following funcitons:
    1. Accept the details of 'n' employees and calculate the salary.
    2. Display the details of 'n' employees.
    3. Display the details of employee having maximum salary for both types of employees.
*/
#include <iostream>
#include <string>
using namespace std;


class Employee {
protected:
    int emp_code;
    string name;
    double salary;

public:
    // Constructor  initialize  
    Employee(int code, string n, double sal) {
        emp_code = code;
        name = n;
        salary = sal;
    }

    // Virtual function to  employee 
    virtual void display() {
        cout << "Employee Code: " << emp_code << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: " << salary << endl;
    }

    // Virtual function salary ( overridden)
    virtual void calculate_salary() = 0;
};

class Fulltime : public Employee {
private:
    double daily_wages;
    int number_of_days;

public:
    // Constructor
	    Fulltime(int code, string n, double sal, double wages, int days)
        : Employee(code, n, sal), daily_wages(wages), number_of_days(days) {}

    // Overriding calculate_salary 
    void calculate_salary() override {
        salary = daily_wages * number_of_days;
    }

    // Overriding display method t
    void display() override {
        Employee::display();
        cout << "Daily Wages: " << daily_wages << endl;
        cout << "Number of Working Days: " << number_of_days << endl;
    }
};


class Parttime : public Employee {
private:
    int number_of_working_hours;
    double hourly_wages;

public:
    // Constructor to initialize 
    Parttime(int code, string n, double sal, int hours, double wages)
        : Employee(code, n, sal), number_of_working_hours(hours), hourly_wages(wages) {}

    // Overriding calculate_salary 
    void calculate_salary() override {
        salary = number_of_working_hours * hourly_wages;
    }

    // Overriding display method 
    void display() override {
        Employee::display();
        cout << "Hourly Wages: " << hourly_wages << endl;
        cout << "Number of Working Hours: " << number_of_working_hours << endl;
    }
};

int main() {
   
    Fulltime fulltime_emp(101, "John Doe", 0, 200, 25);  //  salary  0,  calculated later
    Parttime parttime_emp(102, "Jane Smith", 0, 100, 15);  //  salary  0, alculated later

    //  salary  both 
    fulltime_emp.calculate_salary();
    parttime_emp.calculate_salary();

    
    cout << "\nFulltime Employee Details:\n";
    fulltime_emp.display();
    cout << "\nParttime Employee Details:\n";
    parttime_emp.display();

    return 0;
}
