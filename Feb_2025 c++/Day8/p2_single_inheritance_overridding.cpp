/* inheritance with same member function name in base && derive class
	base_class_name :: function_name(); // in derived class written to call base class
	over riding speed increase
*/
#include<iostream>
using namespace std;

class Base{
	public:
		void print(){ //same as derived class fun
		cout<<"Display Base Class "<< endl;
		}
};

class Derived : private Base{
	public:
		void print(){ // same as base class fun
			// function over riding
			Base :: print();// call base class function execute
			cout<<"Display Derived Class "<< endl;
		}
		
};

main(){
	cout<<"\n ------------------------ \n";
	Derived object1;
	object1.print(); 
}