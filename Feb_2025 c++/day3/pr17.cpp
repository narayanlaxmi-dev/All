//pattern printing 2
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
	for(i= num - 1; i >= 1; i--){
		
		for(j = 1; j <= i; j++){
			cout<<"*";
		}
		cout<<"\n";
	}	
		
}