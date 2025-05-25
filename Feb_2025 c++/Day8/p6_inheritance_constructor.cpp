/* defalut & paramater constructor in inheritance
*/
#include<iostream>
using namespace std;

class A{
	private:
		int a,b,c;
	public:
		// defalut const
		A(){
			cout<<"\nBase Default Constructor Executed";
			a=10, b=20;
			c=a+b;
			cout<<"\naddition "<<c;
		}
		// parametarised const
		A(int z, int x){
			a=z, b=x;
			cout<<"\n A = "<<a<<" B = "<<b;
		}
};

class B: public A{
	private :
		int p, q, r;
	public :
		B(){
			cout<<"\nDerived class Constructor Ececuted";
			q=2, p=4, r=q+p;
			cout<<"\naddition "<<r;
		}
		// parametarised const
		B(int i, float j){
			p=i, q=j;
			cout<<"\n P = "<<p<<" Q = "<<q;
		}
		
		// parametarised const with base class constructor execute
		B(int i, int j): A(77,888){
			p=i, q=j;
			cout<<"\n P = "<<p<<" Q = "<<q;
		}
};

main(){
	B object;
	cout<<"\n--------- parametarised const base class \n\n";
	A obj1(5,10);
	cout<<"\n--------- parametarised const derived class \n\n";
	B obj3(9,9.0f); // only execute base default const and derived para const 
	cout<<"\n--------- parametarised const derived class \n\n";
	//line 40  i need to pass parameter in derived constrctor with link base
	B obj2(100, 200); 
}