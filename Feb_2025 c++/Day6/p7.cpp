/*
create class name programming whilecreating obj if onthis is pass the print pessage i love programming laguage
if substring is pass then programming language the name of that string variable printed 
for ex if cpp pass the i love cpp is printed 
*/

#include<iostream>
using namespace std;

class copyconst{
	private:
		int a, b;		
	public:	
		copyconst(){
		 	a=100, b=200;
		}	 
		// copy comstructor
		copyconst(copyconst &obj){
			a = obj.a;
			b = obj.b;
			cout<<"\n\nCopy A = "<<a<<" B = "<<b;
		}	
		
		void display(){
			cout<<"\n\nA = "<<a<<" B = "<<b;
		}	
};

main(){
	
	copyconst object ;
	object.display();
	
	copyconst object1(object);
}