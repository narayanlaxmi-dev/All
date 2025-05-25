/*
polymorphism > compiler time  > operator 
unary operator over-loading 
*/

#include<iostream>
using namespace std;

class sample{
	private:
		int a, b, c;
		
	public:	
		void set_data(int x, int y, int z){
			a=x,b=y,c=z;
		}
		
		void operator +(){ // - or + not much diff
			a= - a, b= - b, c= - c;
		}
		void display(){
			cout<<"\n A = "<<a<<"\n B = "<<b<<"\n C = "<<c << endl;
		}
		
};

main(){
//	int a,b,c;
//	cout<<"Enter number";
//	cin>>a>>b>>c;

	sample object;
	object.set_data(20,-50,80);
	object.display();
	+object;
	object.display();
}