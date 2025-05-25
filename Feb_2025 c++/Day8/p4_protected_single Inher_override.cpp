/* single inheritance with protected access specifer
*/
#include<iostream>
using namespace std;

class MySuper{
	private:
		int a,b;
	protected:
			int add;
	public:
		void set_data(){
			cout<<"\nEnter number for add in a and b :";
			cin>>a>>b;
		}
		
		void show_data(){ 
		add= a + b;
		cout<<"\n "<<a<<" + "<<b<<" Addtion is  = "<<add<< endl;
		}
		
};

class MySub : private MySuper{
	private:
		int q,r,ans;
	public:
		void set_data(){
			MySuper :: set_data();
			cout<<"\nEnter number multiply+add in q and r :";
			cin>>q>>r;
		}
		
		void show_data(){ 
		MySuper :: show_data();
		ans = (q*r) + add;
		cout<<"\n (q*r)+add  Answer is = "<<ans<< endl;
		}
		
		
};

main(){
	cout<<"\n ------------------------ \n";
	MySub object;
	object.set_data();
	object.show_data();
}