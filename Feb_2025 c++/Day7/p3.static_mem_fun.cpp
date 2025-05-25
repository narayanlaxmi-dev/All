/* ex + op overload fun Static member var
scope resolution operator ::
call static fun class :: fun();
*/

#include<iostream>
using namespace std;

class Class_mem_fun{
	private:
		int a , count;
		static int b; 
		
	
	public:
		// func value inital
		void set_data(){
			cout<<"\nEnter number for a ";
			cin>>a;
			b++;
			count = b;
		}
		
		// func print data
		void print(){
			cout<<"\n A="<<a<<"\n static B ="<<b;
			cout<<"\n Count ="<<count;		
		}
		
		static void s_func(){
			cout<<"\nStatic function calling B ="<<b;
		}
};

int Class_mem_fun :: b;

main(){
	Class_mem_fun obj1, obj2;
//	call static fun with help of class
	Class_mem_fun :: s_func(); // STATIC FUN CALL ONLY :: OPERATOR 
	obj1.set_data();
	obj1.print();
	
	obj2.set_data();
	obj2.print();
	obj1.print(); // obj1 static value same as obj2
	Class_mem_fun :: s_func();
	
}