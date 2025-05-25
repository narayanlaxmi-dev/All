// virtual keyword
#include<iostream>
using namespace std; 

class A{
	private:
		int b;
	public:
		void show(){
				b=65;
				cout<<" \n B ="<<b<< endl;
			}
};

//  virtual keyword add to access A in calss derived in B class is D
class B: virtual public A{

};

class C: virtual public A{//  virtual keyword

};

class D : public B, public C{

};
main(){
	D object;
	object.show();
}