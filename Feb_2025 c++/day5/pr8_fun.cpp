/* 
OOPs Ex 2 Class
write a prog scan to 5 emplyee as info emplyee no, name, salary 
print employee print all employee info 
print info of employee who got maximum salary
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
			cout<<"\t "  << salary <<endl ;
		}
		
		
		int compare(){ // give salary array 
			return (salary);
		}
};


main()
{
	employee e_obj[5]; // array object
	
	int i, max = 0, idx=0;	
	for( i=0; i<5; i++){
		e_obj[i].set();
			if(e_obj[i].compare() > max){
			max = e_obj[i].compare();
			idx = i;
		}
	}

	
	cout<<"\n----------- Employee	Information -----------";
	cout<<"\nEmployee \tName\tSalary";
	for(i=0; i<5; i++){
	e_obj[i].show();	
	}
	
	cout<<"\n-------------------------------";
	cout<<"\nTotal Sum of All Employee max Salary is "<<max;
	cout<<"\n-------------------------------";
	e_obj[idx].show(); // or
	
	for(i=0; i<5; i++){
	
		if(max == e_obj[i].compare()){
			e_obj[i].show();
			break;	
		}
	}
	
}