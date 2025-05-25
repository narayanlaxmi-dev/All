/* OOPs Ex 2 Class
write a prog scan to emplyee as info emplyee no, name, salary 
print employee who get highest salary
*/
#include<iostream>
#include<cstring>
using namespace std;

class employee{
	
	private: 
		int emp_no, salary;
		char emp_name[30];
		
		
	public:
		void set(){ // to initial value
								
			cout << "\nEnter Employee Number :";
			cin >> emp_no;
			cout << "Enter Employee Name :";
			cin >> emp_name;
			cout << "Enter Employee Salary :";
			cin >> salary;						
		}
		
		void show(){ // to print value
			cout<<"\nEmployee Number ="<< emp_no ;
			cout<<"\nEmployee Name ="<< emp_name ;
			cout<<"\nEmployee Salary ="<< salary << endl;
		}
		
		int compare(){
			return (salary);
		}
};


main()
{
	employee narayan, neyan;	
	narayan.set();
	neyan.set();
		
	if(narayan.compare() > neyan.compare()){
		cout<<"first statment ";
		narayan.show();
	}
	else{
		cout<<"second statment ";
		neyan.show();
	}
}