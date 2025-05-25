/*
single inheritance with virtual function in base class
*/
#include<iostream> 
using namespace std;

class Base{

	public:
		virtual void print(){// without virtual not access derived class 
			cout<<"\n print base class... ";
		}
		void show(){
			cout<<"\n show base class... ";
		}
};

class Derived: public Base{
	public:
		void print(){
			cout<<"\n print Derived Class.";
		}
		void show(){
			cout<<"\n Show Derived Class. ";
		}
};

main(){
	Base b1;
	b1.print();
	b1.show();
	Derived d1;
	d1.show();
	d1.print();	
	//------------ now  i want to acces with pointer  
	Base *ptr;
	ptr = &b1;
	cout<<"\n-------- with ptr using virtual fun --------";
	ptr->print();
	ptr->show();
	ptr = &d1;
	ptr->print();
	ptr->show();
}