/*
paramater constructor and defalut for non parameter const
*/

#include<iostream>
using namespace std;

class constructor{
	private:
		int a,b; 
		float c;
		char name[30];
	
	public:
		constructor(){
			cout<<"\nDefalut / Empty constructor ";
		}
		
		constructor(int x, int y, float z){
			a=x,b=y,c=z;	
		}
		
		constructor(int x, float y){
			a = x, b = y;
        	cout << "\na = " << x << " b = " << y << " Sum = " << x + y << endl;		
		}
		
		constructor(int x, int y){
			a = x, b = y;
			c = 0.0f;  // Initialize c to avoid uninitialized value
       		name[0] = '\0'; // Initialize name to empty string
        	cout << "a = " << x << " b = " << y << " Sum = " << x + y << endl;		
		}
		
		constructor(const char z[]){ // if i declare constanr warring gone
		strcpy(name, z);
		
		}
		
		void display(){
			cout<<"\n a = "<<a<<"\n b = "<<b<<"\n c = "<<c<<"\n name = "<<name;
		}
};


main(){
	constructor object1(10,20);
	object1.display();
	
	cout<<"\n----------------------";
	constructor object2(01, 0002, 20.991);
	object2.display();
	
	cout<<"\n---------------------";
	constructor object3("narayan");
	object3.display();
	
	cout<<"\n---------------------";
	constructor object4;
	
	cout<<"\n---------------------";
	constructor object5(01,  20.99f); // same parameter as object2 if i remove F in -> 20.99f  error
	object5.display();
}