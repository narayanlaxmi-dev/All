/* multiple inheritance
*/
#include<iostream>
using namespace std;

class A{
	public:
		void show_data(){
			cout<<"\n Base class A....";
		}
};

class B{ // A B no relation together but A & B derived C
	public :
		void show_data(){
			cout<<"\n Base class B....";
		}
};

class C: public A, public B{
	public :
		void show_data(){
			A :: show_data();
			B :: show_data();
			cout<<"\n Derived class C, A&B parent of C....";
		}
};


main(){
	C object;
	object.show_data();
}