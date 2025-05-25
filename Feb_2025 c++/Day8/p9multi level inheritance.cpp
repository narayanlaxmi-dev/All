/* multi level inheritance Question
*/
#include<iostream>
using namespace std;

class A{
	private:	
	public:
		void show(){
			cout<<"\n grandfather";
		}
		
};

class B : public A{ 
	private:	
	public :
		void show(){
			A :: show();
			cout<<"\n father";
		}
};

class C: public B{
	private:
	public :
		void show(){
			B:: show();
			cout<<"\n Son";
		}
};


main(){
	C object;
	object.show();
}