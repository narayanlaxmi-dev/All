/* this keyword this-> for obj member datatype to formal parameter in member function
-> conectivity operator 
*/

#include<iostream>
using namespace std;

class Test{
	private:
		int a; 
		float b; 
		char c;
	public :
		// to used same name as class name used this 
		void set(int a, float b, char c){
//			a=e,  b=w, c=q; 
//		cout<<"\n A="<<e<<" B="<<w<<" C="<<q;

		this->a = a; // if i dont used this-> it give garbage value of a in a 
		this->b = b;
		this->c = c;
		
		cout<<"\n A="<<a<<" B="<<b<<" C="<<c;
		}
};

main(){
	Test t1;
	t1.set(10, 9.30,'a');
}