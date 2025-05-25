#include<iostream>
using namespace std;
class Employee{
	private:
		int  salary;
		float HRA =0,  DA=0;
		
		// hide member method/function no show in main
		float calcSalary(){
			HRA = salary * 0.2;
			DA = salary * 0.5;
			return salary +HRA + DA;
		}
	public:
		void ipdetails(int sal) {
        salary = sal;
        	
		}				
		void displayEmp(){
			cout<<"--- EMPLOYEE DETAILS ---"<< endl;
		cout<<"the Salary is: "<<salary<<endl;
		// first call thisthen work hra and da will be calculated
		cout<<"the GROSS Salary is: "<<calcSalary()<< endl;  
		cout<<"the HRA is: "<<HRA<< endl;
		cout<<"the DA is: "<<DA<<endl; 
		}
		
};

main(){
	float hra,da ;
	int sal;
	string n;
	cout<<"\n Enter name: ";
	cin>>n;
	cout<<"\n Enter Basic salary: ";
	cin>>sal;
	
	
	Employee obj;
	obj.ipdetails(sal);
	obj.displayEmp();
	
	Employee obj1;
	obj1.ipdetails(sal);
	obj1.displayEmp();
}