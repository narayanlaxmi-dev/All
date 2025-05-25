/* ex + op overload function
*/

#include<iostream>
using namespace std;

class Test_op{
	private:
		int a;
		float b;
	
	public:
		// func value inital
		void set_data(){
			cout<<"\nEnter number for a and b ";
			cin>>a>>b;
		}
		
		// func print data
		void print(){
			cout<<"\n A="<<a<<"\n B="<<b;
		}
		
		// fun op overloading   //,This is automatically called when '+' is used with
//		compile time polymorphism fun
		Test_op operator +(Test_op & object){
			Test_op  answer;
			answer.a = a + object.a;
			answer.b = b + object.b;
			return (answer);
		}
};

main(){
	Test_op obj1;
	obj1.set_data();
	obj1.print();
	
	Test_op obj2 ;
	obj2.set_data();
	obj2.print();
	cout<<"\n |--------------- Operator Overload Function ---------------|";
	Test_op obj;
	obj = obj1 + obj2; // = assign obj all value
	obj.print();
	
}