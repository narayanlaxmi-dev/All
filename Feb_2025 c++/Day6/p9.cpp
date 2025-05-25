/*
Deconstructor to delete memory reverse
*/

#include<iostream>
using namespace std;

class sample{
	private:
		int a,b,count;
		
	public:	
		sample(int x){
			count=x; // declare in object 1 and 2 
		}
		// destructor in only c++
		~sample(){
			cout<<"\nCount "	<<count<<"Destroyed";
		}
		
		void set(){
			cout<<"\nEnter number :";
			cin>>a;
			cout<<"Enter number :";
			cin>>b;
			
		}
		void show(){
			cout<<"\n\nA = "<<a<<" B = "<<b<<" sum is "<<a+b <<endl;
		}
};

main(){
	sample obj(1);
	obj.set();
	obj.show();
	
	sample obj1(2);
	obj1.set();
	obj1.show();
	
}