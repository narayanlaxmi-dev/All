/* write pa prog scan emp info empno, name, sal 
print attendence of 6 month 6 moth=180 day
calc total attendace sheet
if total attendence day >=150 increment sal 5000 otherwise 2500
*/

#include<iostream>
using namespace std;

class employee{
	
	private: 
		int emp_no, salary, att[6], total=0;
		char emp_name[30];
				
	public:
		void set(){ // to initial value
								
			cout << "\nEnter Employee Number :";
			cin >> emp_no;
			cout << "Enter Employee Name :";
			cin >> emp_name;
			cout << "Enter Employee Salary :";
			cin >> salary;	
			cout << "Enter Employee Attendence sheet per month arr[6] :";
			for(int i=0; i<=5; i++){
				cin>> att[i];
				total = total + att[i]; // total addition 
			}
		}
		
		void show(){ // to print value
			cout<<"\n \t"<< emp_no ;
			cout<<"\t "  << emp_name ;
			cout<<"\t "  << salary ;
			cout<<"\t" <<total <<endl ;
		}
		
		void process(){
			if(total >= 150)
				salary = salary + 5000; // salary increment 
			else
				salary = salary + 2500;
		}
};
		
main(){
	employee hello;
	hello.set();
	hello.show();
	hello.process();
	hello.show();
}