#include<iostream>
using namespace std;
class A{
	private:
		string name, gender;
	public:
		A(string name, string gender){
			this->gender = gender;
			this->name = name;
		}
		void display(){
			cout<<"\n name:"<<name<<"\n gender"<<gender;
		}
};

main(){
	string n, g;
	cout<<"Enter name:";
	cin>>n;
	cout<<"Enter gender;";
	cin>>g;
	
	A obj("dac","m");
	obj.display();
	
}