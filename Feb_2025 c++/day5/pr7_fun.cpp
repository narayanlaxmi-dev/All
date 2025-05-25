/* 
OOPs Ex 2 Class
write a prog scan to 5 emplyee as info emplyee no, name, salary 
print employee who get highest salary
calc total salary and avgsalary
*/

#include<iostream>
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
			cout<<"\n \t"<< emp_no ;
			cout<<"\t "  << emp_name ;
			cout<<"\t "  << salary<<endl ;
		}
		
		int compare(){
			return (salary);
		}
};


main()
{
	employee e_obj[5];
	
	int i,sum = 0, avg;	
	for( i=0; i<5; i++){
		e_obj[i].set();
		sum =sum + e_obj[i].compare();
	}
	avg = sum / 5;
	
	cout<<"\n----------- Employee	Information -----------";
	cout<<"\nEmployee \tName\tSalary";
	for(i=0; i<5; i++){
	e_obj[i].show();	
	}
	
	cout<<"\n-------------------------------";
	cout<<"\nTotal Sum of All Employee Salary is "<<sum;
	cout<<"\nTotal Sum of All Employee Salary avg  is "<<avg;
}