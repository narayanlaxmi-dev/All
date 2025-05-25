/* ex + op overload fun Static member var
scope resolution operator ::
*/

#include<iostream>
using namespace std;

class Test_op{
	private:
		int a;
		static int b; // static to b value is 0 initial and same value to all obj
		
	
	public:
		// func value inital
		void set_data(){
			cout<<"\nEnter number for a and b ";
			cin>>a;
			b++;
		}
		
		// func print data
		void print(){
			cout<<"\n A="<<a<<"\n Static B="<<b;		
		}
};

int Test_op :: b;

main(){
	Test_op obj1, obj2;
	obj1.set_data();
	obj1.print();
	
	obj2.set_data();
	obj2.print();
	obj1.print(); // obj1 static value same as obj2

	
}