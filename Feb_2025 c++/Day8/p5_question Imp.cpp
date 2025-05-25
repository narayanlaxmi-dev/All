/* single inheritance with protected access specifer to use derivated class 
2 class emp or bonus
bonus 40% if attendance >= 250 if<250 20%
bonus netsal=sal+bonus
*/
#include<iostream>
using namespace std;

class Employee{
	private:
		int emp_no;;
		char name[20];
	protected:
		int salary, attendance; 				
	public:
		void set_data(){
			cout<<"\n Enter Employee number ";
			cin>>emp_no;
			cout<<"Enter Total attendance (year) ";
			cin>>attendance;
			cout<<"Enter Employee name ";
			cin.ignore();
			gets(name);
			cout<<"Enter Salary ";
			cin>>salary;
		}
		void show_data(){
			cout<<"\n Employee number "<<emp_no;
			cout<<"\n Employee name "<<name;
			cout<<"\n Total attendance (year) "<<attendance;
			cout<<"\n Employee salary "<<salary;
		}		
};

class Bonus : private Employee{
	private:
		float bonus, netsalary;
	public:		
		void set_data(){
			Employee :: set_data();
		}		
		void calc(){
			if(attendance >= 250 && attendance <= 365)
				bonus = salary * 0.4 ; // 0.4 = 40% // bonus = salary * 40 / 100;
						
			if(attendance<250 && attendance>=1)
				bonus = (salary * 20) / 100 ; // 0.2 = 20%
			
			netsalary = salary + bonus;	
		}	
		void show_data(){
			Employee :: show_data();
			cout<<"\nBonus "<<bonus;
			cout<<"\nNet salary "<<netsalary;
		}
};

main(){
	cout<<"\n ------------------------ \n";
	Bonus object;
	object.set_data();
	object.calc();
	object.show_data();
	
}