/*
polymorphism > compiler time  > Function  Overriding visit p11 to clear 
*/

#include<iostream>
using namespace std;

class sample{
	private:
		int a,b;
		char str[30]= "narayan";
		float x;
	public:	
		void set_data(){
			cout<<"\nEnter number for a and b ";
			cin>>a>>b;
		}
		float set_data(float w){
			return (w*w);
		}
		
		int set_data(int q, int w){
			a=q, b=w;
			return (a+b);
		}
		void show(){
			cout<<"\nA = "<<a<<" B = "<<b<<" String is "<<str <<endl;
		}
};

main(){
	sample obj, object;
	obj.set_data();
	obj.show();
	
	sample obj1;
	obj1.set_data();
	obj1.show();
	
	cout<<"\n The ploat value square is "<<object.set_data(4.50) ;
}