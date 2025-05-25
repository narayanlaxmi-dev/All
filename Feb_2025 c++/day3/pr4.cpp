// write a prog print series odd
#include<iostream>
using namespace std;

int main(){
	int var1 = 1, no ;
	cout<<"Enter Number to Print number :\n";
	cin>>no;
	
	cout<<"Series 1..... to .."<<no<<" odd print\n";
	var1 = 1;
	while(var1 <= no){
		 
		cout <<var1<<"\n";
		var1 = var1 + 2;	// 1 inc by 2
	}
	
		cout<<"Series 1..... to .."<<no<<" even print\n";
	var1 = 2;
	while(var1 <= no){
		 
		cout <<var1<<"\n";
		var1 = var1 + 2;	// 2 inc by 2
	}
	
	return 0;
}