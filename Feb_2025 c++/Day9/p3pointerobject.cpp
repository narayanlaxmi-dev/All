/*  this keyword this-> pointer object to
	created(new) printed(->fun();) deleted(delete) for delete Deconstructor is needed
*/

#include<iostream>
using namespace std;

class Sample{
	private:
		int a, b, c, n;
	public :
		// default constructor
		Sample(){
			a=10;
			b=20;
		}
		// parametarized constructor
		Sample(int n){
			a=4, b=8;
			this->n=n;
		}
		
		// De Constructor
		~Sample(){
			cout<<endl <<n<<" Object is Destroyed ...";
		}
		
		void show(){
			c=a+b;
			cout<<"\n A="<<a<<" B="<<b<<" C="<<c<<"\n Counter "<<n<< endl ;			
		}
};

main(){
	Sample object;// by default 1 create and delete 
	object.show();
	
	Sample obj1(1);
	obj1.show();
	
	
	Sample obj2(21);
	obj2.show();
	
	
	cout<<"\n ------------------ Pointer object ------------------ ";
	Sample *ptr; // only declare
	cout<<"\n Pointer object used allocated ";
	ptr = new Sample(33); // allocated memory 
	ptr->show();
	cout<<"\n Pointer object DE-allocated ";
	delete ptr;
	ptr->show();
	
}
