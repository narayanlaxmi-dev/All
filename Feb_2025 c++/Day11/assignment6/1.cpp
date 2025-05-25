// modify integer using call by refrence 
#include<iostream>
using namespace std;
int modify(int &a){
	return a=a*2;
}

main(){
	int no;
	cout<<"ENter number: ";
	cin>>no;
	cout<<modify(no);
	
}