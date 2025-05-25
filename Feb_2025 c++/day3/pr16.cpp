//pattern printing 1
#include<iostream>
using namespace std;
main(){
	int i,j,num;
	cout<<"Enter number";
	cin>>num;
	for(i=1; i<=num; i++){
		
		for(j=1; j<=i; j++){
			cout<<"*";
		}
		cout<<"\n";
	}
}