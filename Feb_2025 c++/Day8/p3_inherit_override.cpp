/* inheritance override mem fun with different fun name so it slow 
*/
#include<iostream>
using namespace std;

class MySuper{
	private:
		int a,b,c;
	public:
		void set1(){
			cout<<"\nEnter number for add in a and b :";
			cin>>a>>b;
		}
		
		void show1(){ 
		c= a + b;
		cout<<"\n "<<a<<" + "<<b<<" Addtion is  C = "<<c<< endl;
		}
};

class MySub : protected MySuper{
	private:
		int a,b,ans;
	public:
		void set2(){
			MySuper :: set1();
			cout<<"Enter number for mult a and b :";
			cin>>a>>b;
		}
		
		void show2(){
			MySuper :: show1();
			ans = a * b;
			cout<<"\n "<<a<<" x "<<b<<" answer "<<ans;
		}
		
};

main(){
	cout<<"\n ------------------------ \n";
	MySub object;
	object.set2(); 
	object.show2();
	
}