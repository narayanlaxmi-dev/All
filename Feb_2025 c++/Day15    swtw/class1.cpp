#include<iostream>
#include<cstring>
using namespace std;
class Employee{
	private:
		int emp_id, salary;
		string name;
		float bonus, p;
		
		int calc_salary(){
			 bonus = salary * p / 100;
			return salary + bonus;
		}
	public:
		Employee(){
			p = 8.5;
		}
		
		void set_data(){
			cout<<"\n enter Employee number :";
			cin>>emp_id;
			cout<<"\n enter name :";
			cin.ignore(); // important for scan user
			getline(cin,name);
			cout<<"\n enter salary :";
			cin>>salary;
		}
		
		void show_data(){
			cout<<"Employee id"<<emp_id <<endl;
			cout<<"name is "<<name<<endl;
			cout<<"salary "<<salary<<endl;
			cout<<"bonus is "<<bonus<<endl;
			cout<<"NET SALARY IS "<<calc_salary()<<endl;
		}
};

main(){
Employee e1;
e1.set_data();
e1.show_data();	
}