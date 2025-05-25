/*   this-> pointer object 
constant CONST used with char in FORMAL parameter
*/

#include<iostream>
using namespace std;

class Person{
	private:
		char name[30];
		int age;
	public:
		// constructor
		Person(const char name[30], int age){
			strcpy(this->name, name);
			this->age = age;
		}
		// member function
		void display(){
			cout<<"\n name = "<<name<<" age = "<<age;
		}
		
		// class  mem fun only in c++
		Person greater(Person object)
		{
			if(age > object.age){ // age = obj && object.age = obj1
				return *this; // return obj value
			}
			else 
				return object; // return obj1 values
		}
};
main(){
	Person obj("jerry", 73), 
	obj1("Tom", 24),
	p("\0",0);
	
	obj.display();
	obj1.display();
	p.display();
	cout<<"\n--------- Class object  compare age LARGEST ---------";
	p= obj.greater(obj1);
	p.display();
}