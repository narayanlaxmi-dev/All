/*
//Problem Statement:
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
Create an instance of TechLead and call showDetails() without ambiguity.
*/

#include<iostream>
using namespace std;

class Employe{
	protected:
		string name;
	public:
		Employe(string n ){
			name = n;
			cout<<"Employee"<<endl;
		}
		
		 virtual void showDetails(){
			cout<<"Employe name is: "<<name<<endl;
		}
};

class Manager : virtual public Employe
{
	public:
		Manager(string n ): Employe(n){
			cout<<"this is manager  class activated"<<endl;
		}
	
};

class Developer : public virtual Employe
{
	public:
	Developer(string n ): Employe(n){
			cout<<"this is Developer  class activated"<<endl;
		}
};

class Techlead : public Developer , public Manager
{
	public:
	Techlead(string n ): Employe(n), Manager(n), Developer(n)
	{
			cout<<"this is Techlead  activated"<<endl;
	}
};



int main(){
//	string n;
//	cout<<"ENter name: ";
//	cin>>n;

	Techlead a("ABCD");
	a.showDetails();
	
	return 0;
}