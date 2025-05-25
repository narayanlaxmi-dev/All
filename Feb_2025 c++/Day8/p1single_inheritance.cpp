//inheritance z
#include<iostream>
using namespace std;

// base class
class Base{
	public:
		// member functiono
		void show(){
		cout<<"Display Base Class ";
		}
};

// derived class
class Derived : public Base{
	public:
		// member function
		void show_data(){
			cout<<"Display Derived Class ";
		}
		
};

main(){
	Base object;	
	object.show();
	cout<<"\n ------------------------ \n";
	Derived object1;
	object1.show_data(); // Derived class mem fun
	object1.show(); // Base class mem fun access
}