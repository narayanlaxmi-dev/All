// write a prog print no of n times

#include<iostream>
using namespace std;

int main(){
	int var1 = 1, no ;
	cout<<"Enter Number to Print number :\n";
	cin>>no;
	
	cout<<"Series 1....."<<no<<" times print\n";
	while(var1 <= no){
		cout <<var1<<"\n";
		var1 ++;
	}
	
	
	return 0;
}