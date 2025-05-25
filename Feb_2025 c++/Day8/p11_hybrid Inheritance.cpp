/* Hybrid inheritance Question
*/
#include<iostream>
using namespace std;

class A{
	private:	
	protected:
		void show(){
			cout<<"\n 1 A Base class. ";
		}
};

class B : public A{ 
	private: 
	public :
		void show(){
			cout<<"\n 2 B Der class.. ";
		}
};

class C : public A{ 
	private: 
	public :
		void show(){
			A:: show();
			cout<<"\n 3 C der class... ";
		}
};

class D : public C,public B{ 
	private: 
	public :
		void show(){
			C :: show();
			B :: show();
			cout<<"\n 4 D der class.... ";
		}
};

main(){
	D object;
	object.show();
}