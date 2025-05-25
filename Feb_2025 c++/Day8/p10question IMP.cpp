/* multi level inheritance Question
*/
#include<iostream>
using namespace std;

class Employee{
	private:	
		int emp_no;
		char name[30];
	protected:
		int salary;
	public:
		void set(){
			cout<<"\n Enter Employee number";
			cin>>emp_no;
			cout<<"enter name ";
			cin>>name;
			cout<<"Ener salary";
			cin>>salary;
		}
		void show(){
			cout<<"\n  Employee number "<<emp_no;
			cout<<" name "<<name;
			cout<<" salary "<<salary;
		}
};

class Bonus : public Employee{ 
	private: 
		
	protected:
		float bonus,b_sal ;
	public :
		void set(){
			Employee::set(); 
			bonus = salary * 40 /100; // or 0.4
			b_sal = salary;
		}
		void show(){
			Employee :: show();
			cout<<"\n Bonus is "<< bonus;
			cout<<" \n Salary"<< b_sal;
		}
};

class app: private Bonus{
	private:
		int apperation, amount;
	public :
		void set(){
			Bonus :: set();
			cout<<"\nEnter appripate :";
			cin>> apperation;
			amount = b_sal + bonus + apperation;
			
		}
		
		void show(){
			
			Bonus :: show();
			cout<<"\n apperation "<<amount;
		}
};


main(){
	app object;
	object.set();
	object.show();
}