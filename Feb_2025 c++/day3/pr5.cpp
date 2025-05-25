// write a prog print no table input no

#include<iostream>
using namespace std;

int main(){
	int table, no=1 ;
	cout<<"Enter number to print table :\n";
	cin>>table;
	
	cout<<"Table Print for "<<table<<"\n";
	while(no <= 10){
		cout <<"\n"<<table<<" * "<<no<<"  = "<<table*no ;
		no ++;
	}
	
	
	return 0;
}