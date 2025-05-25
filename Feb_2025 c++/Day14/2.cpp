/*
Problem Statement:
You are developing a hierarchical employee management system for a company. The system consists of:

A base class Employee, which contains the employee's name and functionality to display details.
Two derived classes:
Manager (inherits from Employee)
Developer (inherits from Employee)
A final derived class TechLead, who is both a Manager and a Developer.
Tasks to Implement:
Create a class Employee with:

A string name to store the employee’s name.
A function showDetails() to display the name.
Create two derived classes (Manager and Developer) that inherit from Employee.

Without virtual inheritance:
Instantiate a TechLead object and call showDetails().
Observe the ambiguity error caused due to duplicate inheritance.
Solve the diamond problem using virtual inheritance.

Modify Manager and Developer to virtually inherit from Employee.
Ensure TechLead inherits properly and avoids duplicate data.
Create an instance of TechLead and call showDetails() without ambiguity.*/

#include<iostream>
using namespace std;
class Employee {
protected:
    string name;
public:
    Employee(string n) {
        name = n;  // Normal assignment
        cout<<"\n Employee activated"<<endl;
    }

    void showDetails() {
        cout << "\nEmployee Name: " << name << endl;
    }
};



// virtual developer
class Developer:public virtual Employee
{
	public:
	Developer(string n):Employee(n)
	{	
	 cout<<"\nDevloper activated";
	}
};

// virtual Manager
class Manager:public virtual Employee
{
	public:
	Manager(string n):Employee(n)
	{	
	 cout<<"\nManager activated";
	}
};
class TechLead: public Developer,public Manager
{
	public:
	TechLead(string n): Employee(n), Developer(n), Manager(n)
	{	
	 cout<<"\nTechlead activated";
	}
};
int main()
{
	TechLead l("ABCD");
	l.showDetails();
	return 0;
}

