/*
Deconstructor to delete memory reverse
*/

#include<iostream>
using namespace std;

class copyconst{
	private:
		int a, b;	
		float c;
	public:	
		
		copyconst(){
			cout<<"\nDefault constructor";
		}	
		
		copyconst(int q, int w, float e){
			a=q, w=b, e=c;
		}
		void set(){
			cout<<"\nEnter number :";
			cin>>a;
			cout<<"\nEnter number :";
			cin>>b;
			cout<<"\nEnter float number :";
			cin>>c;
		}
		void display(){
			cout<<"\n A = "<<a<<"\n C = "<<b<<"\n C = "<<c;
		}	
		~copyconst(){
			cout<<"\nConstructor destroyed";
		}
};

main(){
	copyconst defalut;
	cout<<"\n----------------";
	copyconst object(10,24,54.04f) ;
	object.display();
	cout<<"\n----------------";
	copyconst object2 ;
	object2.set();
	object2.display();
	
}